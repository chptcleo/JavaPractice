package com.pattern.iterator.menu;

public class Client {

	public static void main(String[] args) {
		new Client().test();
	}

	void test() {
		Menu dinnerMenu = new DinnerMenu();
		Menu pancakeMenu = new PancakeMenu();

		Waitress waitress = new Waitress(dinnerMenu, pancakeMenu);

		waitress.printMenu();
	}

}
