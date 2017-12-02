package com.wallace.pattern.factorymethod.pizzastore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			return new ChicagoCheesePizza();
		} else if ("clam".equals(type)) {
			return new ChicagoClamPizza();
		} else {
			return null;
		}
	}

}
