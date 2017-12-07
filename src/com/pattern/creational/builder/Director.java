package com.pattern.creational.builder;

public class Director {
	
	public Builder builder;
	
	public void construct(){
		
		builder = new ConcreteBuilder();
		builder.buildPart1();
		builder.buildPart2();
		builder.retrieveResult();
	}

}
