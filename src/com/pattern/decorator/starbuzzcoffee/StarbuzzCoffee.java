package com.pattern.decorator.starbuzzcoffee;

public class StarbuzzCoffee {

	public static void main(String[] args) {

		Beverage decaf = new Decaf();
		System.out.println(decaf.getDescription() + decaf.cost());

		Beverage espresso = new Espresso();
		espresso = new Soy(espresso);
		espresso = new Whip(espresso);
		espresso = new Whip(espresso);
		espresso = new Milk(espresso);
		System.out.println(espresso.getDescription() + espresso.cost());

		Beverage darkRoast = new DarkRoast(BeverageSize.VENTI);
		darkRoast = new Mocha(darkRoast);
		System.out.println(darkRoast.getDescription() + darkRoast.cost());
	}

}
