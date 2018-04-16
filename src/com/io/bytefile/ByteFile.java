package com.io.bytefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ByteFile {

	private void write() {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream("D://eclipse-workspace/JavaPractice/src/com/io/bytefile/byte_file"));
			Person wallace = new Person(34);
			objectOutputStream.writeObject(wallace);
			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void read() {
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(
					new FileInputStream("D://eclipse-workspace/JavaPractice/src/com/io/bytefile/byte_file"));
			Person wallace = (Person) objectInputStream.readObject();
			System.out.println(wallace.getAge());
			objectInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteFile byteFile = new ByteFile();
		byteFile.write();
		byteFile.read();
	}

}
