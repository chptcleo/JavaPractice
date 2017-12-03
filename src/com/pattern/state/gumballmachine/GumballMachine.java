package com.pattern.state.gumballmachine;

public class GumballMachine {

	private State state;

	private State noQuarterSate;

	private State hasQuarterSate;

	private State soldSate;

	private State soldOutSate;

	private int count;

	public GumballMachine(int count) {
		this.count = count;

		noQuarterSate = new NoQuarterState(this);
		hasQuarterSate = new HasQuarterState(this);
		soldSate = new SoldState(this);
		soldOutSate = new SoldOutState(this);

		if (this.count > 0) {
			this.state = noQuarterSate;
		}
	}

	public State getNoQuarterSate() {
		return noQuarterSate;
	}

	public void setNoQuarterSate(State noQuarterSate) {
		this.noQuarterSate = noQuarterSate;
	}

	public State getHasQuarterSate() {
		return hasQuarterSate;
	}

	public void setHasQuarterSate(State hasQuarterSate) {
		this.hasQuarterSate = hasQuarterSate;
	}

	public State getSoldSate() {
		return soldSate;
	}

	public void setSoldSate(State soldSate) {
		this.soldSate = soldSate;
	}

	public State getSoldOutSate() {
		return soldOutSate;
	}

	public void setSoldOutSate(State soldOutSate) {
		this.soldOutSate = soldOutSate;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void releaseBall() {
		if (count != 0) {
			count = count - 1;
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void insertQuarter() {
		this.state.insertQuarter();
	}

	public void ejectQuarter() {
		this.state.ejectQuarter();
	}

	public void turnCrank() {
		this.state.turnCrank();
		this.state.dispense();
	}
}
