package com.pattern.behavioral.chainofresp;

public abstract class Handler {

	protected Handler successor;

	public abstract void handleRequest();

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
}
