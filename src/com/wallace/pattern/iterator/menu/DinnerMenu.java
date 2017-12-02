package com.wallace.pattern.iterator.menu;

public class DinnerMenu implements Menu {

	static final int MAX_ITEMS = 6;

	int numberOfItems = 0;

	MenuItem[] menuItems;

	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("dinner item", "item A", true, 2.99);
		addItem("dinner item", "item B", true, 2.59);
		addItem("dinner item", "item C", true, 3.29);
		addItem("dinner item", "item D", true, 3.05);
	}

	@Override
	public Iterator createIterator() {

		return new DinnerMenuIterator(menuItems);
	}

	@Override
	public void addItem(String name, String description, boolean vegetarian,
			double price) {
		if (numberOfItems >= MAX_ITEMS) {
			System.out
					.println("sorry, the menu is full, you can't add anymore");
		} else {
			MenuItem menuItem = new MenuItem(name, description, vegetarian,
					price);
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
}
