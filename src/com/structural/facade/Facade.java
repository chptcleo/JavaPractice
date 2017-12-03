package com.structural.facade;

public class Facade {

	private Camera camera = new Camera();
	
	private Light light = new Light();
	
	public void turnOn(){
		camera.turnOn();
		light.turnOn();
	}
	
	public void turnOff(){
		camera.turnOff();
		light.turnOff();
	}
}
