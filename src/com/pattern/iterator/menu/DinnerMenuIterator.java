package com.wallace.pattern.iterator.menu;

public class DinnerMenuIterator implements Iterator {

	MenuItem[] menuItems;

	int position = 0;

	public DinnerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems[position];
		position = position + 1;
		return menuItem;
	}

	@Override
	public boolean hasNext() {
		if (position >= menuItems.length || menuItems[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void remove() throws Exception {
		if (position <= 0) {
			throw new Exception("can't remove item");
		}
		menuItems[position] = null;
		position = position - 1;
	}
}
