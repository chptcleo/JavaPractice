package com.wallace.pattern.observer.weatherstation;

public class ForecastDisplay implements Observer, DisplayElement {

	private float temperature;

	private float humidity;

	private float pressure;

	public ForecastDisplay(Subject subject) {
		subject.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("forecast ---> temperature: " + temperature
				+ " humidity: " + humidity + " pressure: " + pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
