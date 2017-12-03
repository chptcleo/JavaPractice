package com.behavioral.observer;

import java.util.Vector;

public class ConcreteSubject implements Subject {

	private Vector<Observer> vector = new Vector<Observer>();

	public void attach(Observer ob) {
		// TODO Auto-generated method stub
		vector.add(ob);
	}

	public void detach(Observer ob) {
		// TODO Auto-generated method stub
		vector.remove(ob);
	}

	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer ob : vector) {
			ob.update();
		}
	}

}
