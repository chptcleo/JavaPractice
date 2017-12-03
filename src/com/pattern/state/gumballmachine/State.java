package com.pattern.state.gumballmachine;

public abstract class State {

	void insertQuarter() {
		System.out.println("you can't insert quarter");
	}

	void ejectQuarter() {
		System.out.println("you can't eject quarter");
	}

	void turnCrank() {
		System.out.println("you can't turn crank");
	}

	void dispense() {
		System.out.println("you can't dispense");
	}

	void refill(int count) {
		System.out.println("you can't refill");
	}
}
