package com.pattern.structural.decorator;

public class Decorator implements Component {

	private Component component;
	
	public Decorator(){
		
	}
	
	public Decorator(Component component){
		this.component = component;
	}
	
	public void operation() {
		// TODO Auto-generated method stub
		component.operation();
		System.out.println("Decorator");
	}

}
