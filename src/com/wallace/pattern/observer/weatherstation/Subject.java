package com.wallace.pattern.observer.weatherstation;

public interface Subject {

	public void addObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
}
