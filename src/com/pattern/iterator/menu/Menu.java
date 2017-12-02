package com.wallace.pattern.iterator.menu;

public interface Menu {

	Iterator createIterator();

	void addItem(String name, String description, boolean vegetarian,
			double price);
}
