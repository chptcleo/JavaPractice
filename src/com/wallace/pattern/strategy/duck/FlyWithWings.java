package com.wallace.pattern.strategy.duck;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Real duck fly");
	}

}
