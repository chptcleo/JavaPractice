package com.pattern.templatemethod.Beverage;

public abstract class CaffeineBeverage {

	final void prepareRecipe() {

		boilWater();
		brew();
		pourInCup();
		if (needCondiments()) {
			addCondiments();
		}
	}

	void boilWater() {
		System.out.println("boil water");
	}

	void pourInCup() {
		System.out.println("pour in cup");
	}

	abstract void brew();

	abstract void addCondiments();

	boolean needCondiments() {
		return true;
	}
}
