package com.pattern.creational.builder;

public class ConcreteBuilder implements Builder {
	
	public Product product;

	public void buildPart1() {
		// TODO Auto-generated method stub
		System.out.println("build part1");
	}

	public void buildPart2() {
		// TODO Auto-generated method stub
		System.out.println("build part2");
	}

	public Product retrieveResult() {
		// TODO Auto-generated method stub
		System.out.println("retrieve product");
		return product;
	}

}
