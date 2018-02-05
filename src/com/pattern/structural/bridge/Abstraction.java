package com.pattern.structural.bridge;

public abstract class Abstraction {

	private Implementor impl;
	
	public Abstraction(Implementor impl) {
		this.impl = impl;
	}
	
	public void operation(){
		impl.operationImpl();
	}
	
	public Implementor getImplementor() {
		return this.impl;
	}
}
