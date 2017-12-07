package com.pattern.behavioral.memento.single;

public class Client {

	private static Originator o = new Originator();
	
	private static Caretaker c = new Caretaker();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		o.setState("On");
		c.setMemento(o.createMemento());
		
		o.setState("Off");
		
		o.restoreMemento(c.getMemento());
	}

}
