package com.behavioral.iterator.inner;

public interface Iterator {

	public void first();
	
	public void next();
	
	public boolean isDone();
	
	public Object currentItem();
}
