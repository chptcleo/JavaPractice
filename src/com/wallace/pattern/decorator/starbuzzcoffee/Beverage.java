package com.wallace.pattern.decorator.starbuzzcoffee;

public abstract class Beverage {

	public String description = "unknown beverage";

	public BeverageSize beverageSize = BeverageSize.GRANDE;

	public BeverageSize getSize() {
		return beverageSize;
	}

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
