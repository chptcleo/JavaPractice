package com.pattern.behavioral.iterator.extern;

public class Client {

	private Iterator it;

	private Aggregate agg = new ConcreteAggregate();

	public void operation() {
		it = agg.createIterator();
		while (!it.isDone()) {
			System.out.println(it.currentItem().toString());
			it.next();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client().operation();
	}

}
