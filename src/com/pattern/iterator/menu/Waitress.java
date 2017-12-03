package com.pattern.iterator.menu;

public class Waitress {

	Menu dinnerMenu;
	Menu pancakeMenu;

	public Waitress(Menu dinnerMenu, Menu pancakeMenu) {
		this.dinnerMenu = dinnerMenu;
		this.pancakeMenu = pancakeMenu;
	}

	public void printMenu() {
		Iterator dinnerMenuIterator = dinnerMenu.createIterator();
		Iterator pancakeMenuIterator = pancakeMenu.createIterator();

		printMenu(dinnerMenuIterator);
		printMenu(pancakeMenuIterator);
	}

	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out
					.println(menuItem.getName() + "," + menuItem.description
							+ "," + menuItem.isVegetarian() + ","
							+ menuItem.getPrice());
		}
	}
}
