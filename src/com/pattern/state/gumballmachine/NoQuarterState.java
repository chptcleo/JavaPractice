package com.pattern.state.gumballmachine;

public class NoQuarterState extends State {

	private GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	void insertQuarter() {
		System.out.println("you inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterSate());
	}

}
