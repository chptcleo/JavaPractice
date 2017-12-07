package com.pattern.structural.bridge;

public abstract class Abstraction {

	private Implementor impl;
	
	public void operation(){
		impl.operationImpl();
	}
}
