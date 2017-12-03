package com.behavioral.memento.complex;

public class Client {

	private static Originator o = new Originator();

	private static Caretaker c = new Caretaker(o);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		o.setState("state 0");
		c.createMemento();
		o.setState("state 1");
		c.createMemento();
		o.setState("state 2");
		c.createMemento();

		o.printStates();

		System.out.println("Back to state1");

		c.restoreMemento(1);
		o.printStates();

		System.out.println("Back to state2");
		
		c.restoreMemento(2);
		o.printStates();
	}

}
