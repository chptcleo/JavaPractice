package com.pattern.strategy.duck;

public class FlyWithRocket implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying with rocket");
	}

}
