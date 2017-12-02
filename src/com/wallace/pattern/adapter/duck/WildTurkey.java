package com.wallace.pattern.adapter.duck;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("turkey gobble");
	}

	@Override
	public void fly() {
		System.out.println("turkey fly");
	}

}
