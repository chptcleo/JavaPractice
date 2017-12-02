package com.wallace.pattern.decorator.starbuzzcoffee;

public class Decaf extends Beverage {

	public Decaf() {
		description = "decaf";
	}

	@Override
	public double cost() {

		return 1.05;
	}

}
