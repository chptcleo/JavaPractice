package com.pattern.creational.builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
	}

}
