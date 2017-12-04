package com.behavioral.chainofresp;

public class Client {

	private static Handler handler1, handler2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		handler1 = new ConcreteHandler();
		handler2 = new ConcreteHandler();
		handler1.setSuccessor(handler2);
		handler1.handleRequest();
	}

}
