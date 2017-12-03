package com.pattern.observer.weatherstation;

public class WeatherStation {

	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();
		new CurrentConditionDisplay(weatherData);
		new ForecastDisplay(weatherData);

		weatherData.setMeasurements(25, 88, 10);
		weatherData.setMeasurements(30, 81, 9);
		weatherData.setMeasurements(23, 85, 12);
	}

}
