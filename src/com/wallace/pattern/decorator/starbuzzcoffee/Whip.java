package com.wallace.pattern.decorator.starbuzzcoffee;

public class Whip extends CondimentDecorator {

	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {

		return beverage.getDescription() + " whip";
	}

	@Override
	public double cost() {

		return .1 + beverage.cost();
	}

}
