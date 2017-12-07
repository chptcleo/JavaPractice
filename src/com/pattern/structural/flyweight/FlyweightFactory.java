package com.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class FlyweightFactory {

	private HashMap<Character, Flyweight> file = new HashMap<Character, Flyweight>();

	public Flyweight factory(Character state) {

		if (file.containsKey(state)) {
			return (Flyweight) file.get(state);
		} else {
			Flyweight fly = new ConcreteFlyweight(state);
			file.put(state, fly);
			return fly;
		}
	}

	public Flyweight factory(String state) {

		ConcreteCompositeFlyweight comFly = new ConcreteCompositeFlyweight();

		for (int i = 0; i < state.length(); i++) {
			ConcreteFlyweight fly = new ConcreteFlyweight(state.charAt(i));
			comFly.add(state.charAt(i), fly);
		}

		return comFly;
	}

	@SuppressWarnings("rawtypes")
	public void checkFlyweight() {

		for (Iterator it = this.file.entrySet().iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			System.out.println("\nItem " + entry.getKey());
		}
	}

}
