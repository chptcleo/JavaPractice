package com.pattern.compound;

public class RubberDuck implements Quackable {

	Observable observable;

	public RubberDuck() {
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("rubber duck squeak");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

}
