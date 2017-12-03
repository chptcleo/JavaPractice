package com.behavioral.memento.complex;

import java.util.Vector;

public class Originator {

	private Vector<String> states;

	private int index;

	public Originator() {
		states = new Vector<String>();
		index = 0;
	}

	public Memento createMemento() {
		return new Memento(states, index);
	}

	public void restoreMemento(Memento memento) {
		this.states = memento.getStates();
		this.index = memento.getIndex();
	}

	public void setState(String state) {
		this.states.addElement(state);
		this.index++;
	}
	
	public void printStates(){
		System.out.println("index:"+this.index);
		for(int i =0;i<this.states.size();i++){
			System.out.println("state:" + this.states.get(i));
		}
	}

}
