package com.pattern.behavioral.visitor;

public class Client {

	private static ObjectStructure aObject;
	private static Visitor visitor;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aObject = new ObjectStructure();
		aObject.addNode(new NodeA());
		aObject.addNode(new NodeB());
		visitor = new VisitorA();
		aObject.action(visitor);
	}

}
