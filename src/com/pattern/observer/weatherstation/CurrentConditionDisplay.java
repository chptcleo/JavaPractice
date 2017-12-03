package com.pattern.observer.weatherstation;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;

	private float humidity;

	private float pressure;

	public CurrentConditionDisplay(Subject subject) {
		subject.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("current condition ---> temperature: " + temperature + " humidity: "
				+ humidity + " pressure: " + pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
