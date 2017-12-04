package com.behavioral.memento.complex;

import java.util.Vector;

public class Memento {

	private Vector<String> states;
	
	private int index;
	
	@SuppressWarnings("unchecked")
	public Memento(Vector<String> states, int index) {
		// TODO Auto-generated constructor stub
		this.states = (Vector<String>) states.clone();
		this.index = index;
	}

	public Vector<String> getStates() {
		return states;
	}

	public int getIndex() {
		return index;
	}
}
