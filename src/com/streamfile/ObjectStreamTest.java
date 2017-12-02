package com.wallace.streamfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStreamTest {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		new ObjectStreamTest().test();
	}

	private void test() throws FileNotFoundException, IOException,
			ClassNotFoundException {
		Manager kobe = new Manager("kobe", 2500);
		Manager james = new Manager("james", 2000);
		Employee wade = new Employee("wade", 1500);
		james.setSecretary(wade);

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("objectstreamtest.dat"));
		objectOutputStream.writeObject(kobe);
		objectOutputStream.writeObject(james);
		objectOutputStream.writeObject(wade);
		objectOutputStream.close();

		ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream("objectstreamtest.dat"));
		Manager kobe1 = (Manager) objectInputStream.readObject();
		Manager james1 = (Manager) objectInputStream.readObject();
		Employee wade1 = (Employee) objectInputStream.readObject();
		objectInputStream.close();

		System.out.println(kobe1);
		System.out.println(james1);
		System.out.println(wade1);

		kobe.setSalary(1000);

		System.out.println(kobe1);
		System.out.println(james1);
		System.out.println(wade1);

	}
}

class Employee implements Serializable {

	private static final long serialVersionUID = 3034410199772285721L;

	private String name;

	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {

		return getName() + " -" + getSalary();
	}
}

class Manager extends Employee {

	private static final long serialVersionUID = 4051526824743232652L;

	private Employee secretary;

	public Employee getSecretary() {
		return secretary;
	}

	public void setSecretary(Employee secretary) {
		this.secretary = secretary;
	}

	public Manager(String name, double salary) {
		super(name, salary);
	}

}