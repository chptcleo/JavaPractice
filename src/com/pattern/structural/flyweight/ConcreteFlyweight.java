package com.pattern.structural.flyweight;

public class ConcreteFlyweight implements Flyweight {

	private Character intrinsicState = null;

	public ConcreteFlyweight(Character state) {
		this.intrinsicState = state;
	}

	public void operation(String state) {
		// TODO Auto-generated method stub
		System.out.println("\nIntrinsic State = " + this.intrinsicState
				+ " Extrinsic State = " + state);
	}

}
