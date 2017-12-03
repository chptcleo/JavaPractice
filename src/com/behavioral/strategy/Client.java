package com.behavioral.strategy;

public class Client {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strategy sa = new ConcreteStrategyA();
		sa.operation();
	}

}
