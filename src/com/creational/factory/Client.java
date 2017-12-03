package com.creational.factory;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Creator c1 = new ConcreteCreator1();
		Creator c2 = new ConcreteCreator2();
		c1.factoryA();
		c1.factoryB();
		c2.factoryA();
		c2.factoryB();
	}

}
