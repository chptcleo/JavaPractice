package com.wallace.pattern.templatemethod.Beverage;

public class Client {

	public static void main(String[] args) {
		new Client().request();
	}

	void request() {
		Tea tea = new Tea();
		tea.setAnswer(false);
		tea.prepareRecipe();
		CaffeineBeverage coffee = new Coffee();
		coffee.prepareRecipe();
	}
}
