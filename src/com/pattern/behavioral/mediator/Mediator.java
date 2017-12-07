package com.pattern.behavioral.mediator;

public abstract class Mediator {

	public abstract void ColleagueChange(Colleague c);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteMediator cm = new ConcreteMediator();
		cm.createConcreteMediator();
		Colleague1 c1 = new Colleague1(cm);
//		Colleague2 c2 = new Colleague2(cm);
		cm.ColleagueChange(c1);
	}

}
