package com.pattern.iterator.menu;

public interface Iterator {

	MenuItem next();

	boolean hasNext();

	void remove() throws Exception;
}
