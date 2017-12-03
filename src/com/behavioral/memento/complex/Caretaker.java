package com.behavioral.memento.complex;

import java.util.Vector;

public class Caretaker {

	private Originator o;

	private Vector<Memento> mementoes = new Vector<Memento>();

	private int current;

	public Caretaker(Originator o) {
		this.o = o;
		this.current = 0;
	}

	public int createMemento() {
		Memento memento = o.createMemento();
		mementoes.addElement(memento);
		return this.current++;
	}

	public void restoreMemento(int index) {
		Memento memento = mementoes.elementAt(index);
		o.restoreMemento(memento);
	}

	public void removeMemeto(int index) {
		mementoes.removeElementAt(index);
	}
}
