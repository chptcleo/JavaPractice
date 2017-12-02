package com.wallace.pattern.state.gumballmachine;

public class Client {

	void test() {
		GumballMachine gumballMachine = new GumballMachine(10);
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());
	}

	public static void main(String[] args) {
		new Client().test();
	}

}
