package com.behavioral.visitor;

public class NodeB implements Node {

	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	public String operationB(){
		return "NodeB is visited.";
	}
}
