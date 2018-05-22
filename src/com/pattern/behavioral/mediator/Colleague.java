package com.pattern.behavioral.mediator;

public abstract class Colleague {
	
	protected String name;
	
	protected Mediator mediator;

	public Colleague(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);
}
