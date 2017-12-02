package com.wallace.pattern.iterator.menu;

import java.util.List;

public class PancakeMenuIterator implements Iterator {

	List<MenuItem> menuItems;
	java.util.Iterator<MenuItem> innerIterator;

	public PancakeMenuIterator(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
		innerIterator = menuItems.iterator();
	}

	@Override
	public MenuItem next() {

		return innerIterator.next();
	}

	@Override
	public boolean hasNext() {

		return innerIterator.hasNext();
	}

	@Override
	public void remove() throws Exception {
		innerIterator.remove();
	}

}
