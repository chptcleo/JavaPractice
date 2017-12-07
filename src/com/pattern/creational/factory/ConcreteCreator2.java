package com.pattern.creational.factory;

public class ConcreteCreator2 implements Creator {

	public ProductA factoryA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	public ProductB factoryB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
