package com.structural.composite.limpidity;

import java.util.Enumeration;
import java.util.Vector;

public class Composite implements Component{

	private Vector<Composite> vector = new Vector<Composite>();
	
	public Composite getComposite() {
		// TODO Auto-generated method stub
		return this;
	}

	public void operation() {
		// TODO Auto-generated method stub
		
	}

	public void add(Composite c) {
		// TODO Auto-generated method stub
		vector.add(c);
	}

	public void remove(Composite c) {
		// TODO Auto-generated method stub
		vector.remove(c);
	}

	public Enumeration<Composite> components() {
		// TODO Auto-generated method stub
		return vector.elements();
	}

}
