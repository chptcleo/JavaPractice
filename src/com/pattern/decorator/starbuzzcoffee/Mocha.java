package com.wallace.pattern.decorator.starbuzzcoffee;

public class Mocha extends CondimentDecorator {

	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {

		return beverage.getDescription() + " mocha";
	}

	@Override
	public double cost() {
		double cost = 0;
		if (beverage.getSize() == BeverageSize.TALL) {
			cost = .1;
		} else if (beverage.getSize() == BeverageSize.GRANDE) {
			cost = .2;
		} else if (beverage.getSize() == BeverageSize.VENTI) {
			cost = .3;
		}

		return cost + beverage.cost();
	}

}
