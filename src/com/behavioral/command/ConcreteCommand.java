package com.behavioral.command;

public class ConcreteCommand implements Command {

	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}
	
	public void excute() {
		// TODO Auto-generated method stub
		this.receiver.action();
	}

}
