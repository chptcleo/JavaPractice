package com.wallace.pattern.strategy.duck;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Real duck quack");
	}

}
