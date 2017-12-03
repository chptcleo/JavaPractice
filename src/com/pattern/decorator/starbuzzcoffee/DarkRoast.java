package com.pattern.decorator.starbuzzcoffee;

public class DarkRoast extends Beverage {

	public DarkRoast(BeverageSize size) {
		description = "dark roast";
		beverageSize = size;
	}

	public BeverageSize getSize() {
		return beverageSize;
	}

	@Override
	public double cost() {
		double cost = 0;
		if (beverageSize == BeverageSize.TALL) {
			cost = .66;
		} else if (beverageSize == BeverageSize.GRANDE) {
			cost = .99;
		} else if (beverageSize == BeverageSize.VENTI) {
			cost = 1.11;
		}

		return cost;
	}

}
