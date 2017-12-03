package com.pattern.decorator.starbuzzcoffee;

public class Espresso extends Beverage {

	public Espresso() {
		description = "esprsso";
	}

	@Override
	public double cost() {

		return 1.99;
	}

}
