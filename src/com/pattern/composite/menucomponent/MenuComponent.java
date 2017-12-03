package com.pattern.composite.menucomponent;

public abstract class MenuComponent {

	void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	void print() {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		throw new UnsupportedOperationException();
	}
}
