package com.pattern.behavioral.visitor;

public class NodeA implements Node {

	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	public String operationA() {
		return "NodeA is visited.";
	}

}
