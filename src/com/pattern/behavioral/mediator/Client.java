package com.pattern.behavioral.mediator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		client.execute();
	}

	private void execute() {
		Mediator mediator = new ConcreteMediator();
		Colleague kobe = new ConcreteColleague("kobe", mediator);
		Colleague jordan = new ConcreteColleague("jordan", mediator);

		mediator.setColleague1(kobe);
		mediator.setColleague1(jordan);

		kobe.send("I will shout right now");
	}

}
