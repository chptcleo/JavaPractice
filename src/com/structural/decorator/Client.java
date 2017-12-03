package com.structural.decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component c = new ConcreteComponent();
		new Decorator(c).operation();
	}

}
