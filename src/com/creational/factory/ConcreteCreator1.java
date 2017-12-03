package com.creational.factory;

public class ConcreteCreator1 implements Creator {

	public ProductA factoryA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	public ProductB factoryB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
