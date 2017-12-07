package com.pattern.behavioral.iterator.extern;

public class ConcreteAggregate implements Aggregate {

	private Object[] obj = { "kitty", "monkey", "tiger" };

	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}

	public Object getElements(int index) {

		if (index < obj.length) {
			return obj[index];
		} else {
			return null;
		}
	}

	public int size() {
		return obj.length;
	}

}
