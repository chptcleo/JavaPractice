package com.wallace.pattern.compound;

public class ReadheadDuck implements Quackable {

	Observable observable;
	
	public ReadheadDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("read head duck quack");
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
