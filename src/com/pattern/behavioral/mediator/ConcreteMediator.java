package com.pattern.behavioral.mediator;

public class ConcreteMediator extends Mediator {

	@Override
	public void process(Colleague colleague, String msg) {
		// TODO Auto-generated method stub
		if (colleague == colleague1) {
			colleague2.receive(msg);
		} else {
			colleague1.receive(msg);
		}
	}

}
