package com.pattern.behavioral.mediator;

public class ConcreteColleague extends Colleague {

	public ConcreteColleague(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name + " send msg " + msg);
		this.mediator.process(this, msg);
	}

	@Override
	public void receive(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name + " receive msg " + msg);
	}
}
