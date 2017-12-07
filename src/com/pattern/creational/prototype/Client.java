package com.pattern.creational.prototype;

public class Client {

	public PrototypeManager manager;
	public Prototype p;

	public void register() {
		p = new ConcretePrototype();
		Prototype copy = p.clone();
		manager.add(copy);
	}

}
