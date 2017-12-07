package com.pattern.behavioral.iterator.inner;

public class ConcreteAggregate implements Aggregate {

	private Object[] obj = { "kitty", "monkey", "tiger", "pig" };

	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator();
	}

	public int size() {
		return obj.length;
	}

	private class ConcreteIterator implements Iterator {

		private int index = 0;

		public void first() {
			// TODO Auto-generated method stub
			index = 0;
		}

		public void next() {
			// TODO Auto-generated method stub
			if (index < obj.length) {
				index++;
			}
		}

		public boolean isDone() {
			// TODO Auto-generated method stub
			return (index == obj.length);
		}

		public Object currentItem() {
			// TODO Auto-generated method stub
			return obj[index];
		}

	}

}
