package com.wallace.pattern.composite.menucomponent;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	void add(MenuComponent menuComponent) {

		menuComponents.add(menuComponent);
	}

	@Override
	void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	@Override
	MenuComponent getChild(int i) {

		return menuComponents.get(i);
	}

	@Override
	void print() {

		System.out.println(getName() + "," + getDescription());
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public String getDescription() {

		return description;
	}

}
