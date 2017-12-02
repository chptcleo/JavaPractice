package com.wallace.pattern.compound;

public class MallardDuck implements Quackable {

	Observable observable;

	public MallardDuck() {
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("mallard duck quack");
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
