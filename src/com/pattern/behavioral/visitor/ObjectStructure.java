package com.pattern.behavioral.visitor;

import java.util.Enumeration;
import java.util.Vector;

public class ObjectStructure {

	private Vector<Node> nodes;
	private Node node;
	
	public ObjectStructure() {
		// TODO Auto-generated constructor stub
		nodes = new Vector<Node>();
	}
	
	public void addNode(Node node){
		nodes.addElement(node);
	}
	
	public void action(Visitor visitor){
		
		for(Enumeration<Node> e = nodes.elements(); e.hasMoreElements();){
			node = e.nextElement();
			node.accept(visitor);
		}
	}
}
