package com.pattern.state.gumballmachine;

public class SoldState extends State {

	private GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	void dispense() {
		System.out.println("gumball machine dispense");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterSate());
		} else {
			gumballMachine.setState(gumballMachine.getSoldOutSate());
		}
	}

}
