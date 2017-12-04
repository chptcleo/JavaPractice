package com.structural.flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class ConcreteCompositeFlyweight implements Flyweight {

	private HashMap<Character, Flyweight> file = new HashMap<Character, Flyweight>();

	public void add(Character key, Flyweight value) {
		file.put(key, value);
	}

	@SuppressWarnings("rawtypes")
	public void operation(String state) {
		// TODO Auto-generated method stub
		Flyweight fly = null;
		for (Iterator it = this.file.entrySet().iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			fly = (Flyweight) entry.getValue();
			fly.operation(state);
		}
	}

}
