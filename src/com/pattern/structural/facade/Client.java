package com.pattern.structural.facade;

public class Client {

	public static void main(String[] args) {
		Facade f = new Facade();
		f.turnOn();
		f.turnOff();
	}
}
