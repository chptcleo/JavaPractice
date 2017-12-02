package com.wallace.pattern.adapter.duck;

public class Client {

	public static void main(String[] args) {

		Duck duck = new MallardDuck();
		Turkey turkey = new WildTurkey();

		test(duck);
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

		test(turkeyAdapter);
	}

	private static void test(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
