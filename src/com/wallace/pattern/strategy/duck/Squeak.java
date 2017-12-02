package com.wallace.pattern.strategy.duck;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Dummy duck squeak");
	}

}
