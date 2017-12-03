package com.pattern.state.gumballmachine;

public class HasQuarterState extends State {

	private GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	void ejectQuarter() {
		System.out.println("you ejected your quarter");
		gumballMachine.setState(gumballMachine.getNoQuarterSate());
	}

	@Override
	void turnCrank() {
		System.out.println("you turned crank");
		gumballMachine.setState(gumballMachine.getSoldSate());
	}

}
