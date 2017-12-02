package com.wallace.pattern.decorator.starbuzzcoffee;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "house blend";
	}

	@Override
	public double cost() {
		return .89;
	}

}
