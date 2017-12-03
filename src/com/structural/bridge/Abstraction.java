package com.structural.bridge;

public abstract class Abstraction {

	private Implementor impl;
	
	public void operation(){
		impl.operationImpl();
	}
}
