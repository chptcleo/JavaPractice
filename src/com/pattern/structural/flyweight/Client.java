package com.pattern.structural.flyweight;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.factory("hello");
		fly.operation("World");
		factory.checkFlyweight();
	}

}
