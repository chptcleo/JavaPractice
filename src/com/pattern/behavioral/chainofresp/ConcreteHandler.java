package com.pattern.behavioral.chainofresp;

public class ConcreteHandler extends Handler {

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub

		if (this.getSuccessor() != null) {
			System.out
					.println("The request is passed to" + this.getSuccessor());
			this.getSuccessor().handleRequest();
		} else {
			System.out.println("Handle request here");
		}
	}

}
