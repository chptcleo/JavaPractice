package com.pattern.behavioral.iterator.extern;

public interface Iterator {

	public void first();
	
	public void next();
	
	public boolean isDone();
	
	public Object currentItem();
}
