package com.pattern.behavioral.state;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State stateA = new ConcreteStateA();
		State stateB = new ConcreteStateB();
		Context c = new Context();
		c.setState(stateA);
		c.operation();
		c.setState(stateB);
		c.operation();
	}

}
