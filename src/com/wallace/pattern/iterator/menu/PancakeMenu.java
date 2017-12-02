package com.wallace.pattern.iterator.menu;

import java.util.ArrayList;
import java.util.List;

public class PancakeMenu implements Menu {

	List<MenuItem> menuItems = new ArrayList<MenuItem>();

	public PancakeMenu() {
		addItem("pancake item", "item A", true, 1.99);
		addItem("pancake item", "item B", true, 1.59);
		addItem("pancake item", "item C", true, 2.29);
		addItem("pancake item", "item D", true, 2.05);
	}

	@Override
	public Iterator createIterator() {

		return new PancakeMenuIterator(menuItems);
	}

	@Override
	public void addItem(String name, String description, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

}
