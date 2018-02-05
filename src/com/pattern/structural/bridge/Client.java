package com.pattern.structural.bridge;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementor impl = new ImplementorA();
		Abstraction abs = new RefinedAbstractor(impl);
		abs.operation();
	}

}
