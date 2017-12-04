package com.behavioral.mediator;

public abstract class Colleague {

	private Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public abstract void action();

	public void change() {
		mediator.ColleagueChange(this);
	}

}
