package com.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeTesting {

	private File personFile = new File(this.getClass().getResource("").getPath() + "person_file");

	public static void main(String[] args) {
		SerializeTesting serializeTesting = new SerializeTesting();
		serializeTesting.execute();
	}

	private void execute() {
		serialize1();
		serialize2();
		externalize();
	}

	private void serialize1() {
		Person person = new Person("wallace", 35);
		write(person);
		Person anotherPerson = (Person) read();
		System.out.println(person == anotherPerson);
		System.out.println(anotherPerson.getName() + ": " + anotherPerson.getAge());
	}

	private void serialize2() {
		Worker worker = new Worker("chen", 33);
		write(worker);
		Worker anotherWorker = (Worker) read();
		System.out.println(anotherWorker.getName() + ": " + anotherWorker.getAge());
	}

	private void externalize() {
		// Dog dog = new Dog("wolve", "male");
		Dog dog = new Dog();
		dog.setType("wolve");
		dog.setGender("male");
		write(dog);
		Dog anotherDog = (Dog) read();
		System.out.println(anotherDog.getType() + ": " + anotherDog.getGender());
	}

	private void write(Serializable object) {

		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(personFile);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(object);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				objectOutputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private Serializable read() {
		Serializable object = null;
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;

		try {
			fileInputStream = new FileInputStream(personFile);
			objectInputStream = new ObjectInputStream(fileInputStream);
			object = (Serializable) objectInputStream.readObject();
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
		return object;
	}

}
