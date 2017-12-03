package com.pattern.state.gumballmachine;

public class SoldOutState extends State {

	private GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	void refill(int count) {
		System.out.println("you are refilling gumball machine");
		gumballMachine.setCount(count);
	}

}
