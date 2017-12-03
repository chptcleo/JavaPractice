package com.pattern.compound;

public interface QuackObservable {

	void registerObserver(Observer observer);
	
	void notifyObservers();
}
