package com.pattern.factorymethod.pizzastore;

public class PizzaStoreSimulator {

	public static void main(String[] args) {

		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		chicagoPizzaStore.orderPizza("clam");

		PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
		californiaPizzaStore.orderPizza("sugar");
	}

}
