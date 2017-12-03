package com.pattern.factorymethod.pizzastore;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if ("sugar".equals(type)) {
			return new CalifoniaSugarPizza();
		} else if ("fruit".equals(type)) {
			return new CaliforniaFruitPizza();
		} else {
			return null;
		}
	}

}
