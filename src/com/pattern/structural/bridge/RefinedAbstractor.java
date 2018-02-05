package com.pattern.structural.bridge;

public class RefinedAbstractor extends Abstraction {

	public RefinedAbstractor(Implementor impl) {
		super(impl);
	}

	public void operation(){
		System.out.println("RefinedAbstraction operation");
		super.operation();
		super.getImplementor().actionImpl();
	}
}
