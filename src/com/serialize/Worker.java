package com.serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Worker implements Serializable {

	private static final long serialVersionUID = -4301561016902546206L;

	private String name;

	private Integer age;

	public Worker(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
//		objectOutputStream.defaultWriteObject();
		objectOutputStream.writeInt(age);
	}

	private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
//		objectInputStream.defaultReadObject();
		age = objectInputStream.readInt();
	}

}
