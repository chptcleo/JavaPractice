package com.wallace.thread.component;

public class Car {

	private final int id;

	private boolean engine = false;

	private boolean driveTrain = false;

	private boolean wheels = false;

	public Car(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void addEngine() {
		engine = true;
	}

	public void addDriveTrain() {
		driveTrain = true;
	}

	public void addWheels() {
		wheels = true;
	}

	@Override
	public String toString() {

		return "Car " + id + "[ engine: " + engine + " driveTrain: "
				+ driveTrain + " wheels: " + wheels;
	}

}
