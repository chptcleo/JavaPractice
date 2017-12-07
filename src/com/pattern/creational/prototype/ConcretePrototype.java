package com.pattern.creational.prototype;

public class ConcretePrototype implements Prototype {

	public Prototype clone(){
		
		try {
			return (Prototype) super.clone();
			
		} catch (CloneNotSupportedException e) {
			
			return null;
		}
	}
}
