package com.encrypt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;

public class RSATest {

	private static int KEYSIZE = 512;

	private void genKey() throws FileNotFoundException, IOException,
			NoSuchAlgorithmException {

		KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
		SecureRandom sr = new SecureRandom();
		kpg.initialize(KEYSIZE, sr);
		KeyPair kp = kpg.generateKeyPair();

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"./src/com/wallace/encrypt/public.key"));
		oos.writeObject(kp.getPublic());
		oos.close();

		oos = new ObjectOutputStream(new FileOutputStream(
				"./src/com/wallace/encrypt/private.key"));
		oos.writeObject(kp.getPrivate());
		oos.close();

	}

	private void encrypt() throws NoSuchAlgorithmException,
			FileNotFoundException, IOException, ClassNotFoundException,
			NoSuchPaddingException, InvalidKeyException,
			IllegalBlockSizeException, ShortBufferException,
			BadPaddingException {

		KeyGenerator kg = KeyGenerator.getInstance("AES");
		SecureRandom sr = new SecureRandom();
		kg.init(sr);
		SecretKey sk = kg.generateKey();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"./src/com/wallace/encrypt/public.key"));
		Key publicKey = (Key) ois.readObject();
		ois.close();

		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.WRAP_MODE, publicKey);
		byte[] wrappedKey = cipher.wrap(sk);
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(
				"./src/com/wallace/encrypt/encryptedFile"));
		dos.writeInt(wrappedKey.length);
		dos.write(wrappedKey);

		InputStream is = new FileInputStream(
				"./src/com/wallace/encrypt/plaintextFile");
		cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, sk);
		crypt(is, dos, cipher);
		is.close();
		dos.close();
	}

	private void decrypt() throws IOException, ClassNotFoundException,
			NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, ShortBufferException,
			IllegalBlockSizeException, BadPaddingException {

		DataInputStream dis = new DataInputStream(new FileInputStream(
				"./src/com/wallace/encrypt/encryptedFile"));
		int length = dis.readInt();
		byte[] wrappedKey = new byte[length];
		dis.read(wrappedKey, 0, length);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"./src/com/wallace/encrypt/private.key"));
		Key privateKey = (Key) ois.readObject();
		ois.close();

		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.UNWRAP_MODE, privateKey);
		Key key = cipher.unwrap(wrappedKey, "AES", Cipher.SECRET_KEY);

		OutputStream os = new FileOutputStream(
				"./src/com/wallace/encrypt/decryptedFile");
		cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, key);

		crypt(dis, os, cipher);
		dis.close();
		os.close();
	}

	private void crypt(InputStream is, OutputStream os, Cipher cipher)
			throws IOException, ShortBufferException,
			IllegalBlockSizeException, BadPaddingException {

		int blockSize = cipher.getBlockSize();
		int outSize = cipher.getOutputSize(blockSize);
		byte[] inBytes = new byte[blockSize];
		byte[] outBytes = new byte[outSize];

		int inLength = 0;
		boolean more = true;
		while (more) {
			inLength = is.read(inBytes);
			if (inLength == blockSize) {
				int outLength = cipher.update(inBytes, 0, blockSize, outBytes);
				os.write(outBytes, 0, outLength);
			} else {
				more = false;
			}
		}

		if (inLength > 0) {
			outBytes = cipher.doFinal(inBytes, 0, inLength);
		} else {
			outBytes = cipher.doFinal();
		}
		os.write(outBytes);
	}

	public static void main(String[] args) throws NoSuchAlgorithmException,
			FileNotFoundException, IOException, InvalidKeyException,
			ClassNotFoundException, NoSuchPaddingException,
			IllegalBlockSizeException, ShortBufferException,
			BadPaddingException {
		RSATest test = new RSATest();
		test.genKey();
		test.encrypt();
		test.decrypt();
	}

}
