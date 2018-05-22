package com.pattern.behavioral.mediator;

public abstract class Mediator {

	protected Colleague colleague1;

	protected Colleague colleague2;

	public Colleague getColleague1() {
		return colleague1;
	}

	public void setColleague1(Colleague colleague1) {
		this.colleague1 = colleague1;
	}

	public Colleague getColleague2() {
		return colleague2;
	}

	public void setColleague2(Colleague colleague2) {
		this.colleague2 = colleague2;
	}

	public abstract void process(Colleague colleague, String msg);
}
