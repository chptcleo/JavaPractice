package com.behavioral.templateMethod;

public abstract class AbstractClass {

	public void TemplateMethod(){
		
		operation1();
		operation2();
		operation3();
	}
	
	protected abstract void operation1();

	protected abstract void operation2();
	
	private final void operation3(){
		System.out.println("AbstractClass operation3");
	}
	
}
