package com.pattern.creational.singleton;

public class DoubleCheckSingleton {

	private static DoubleCheckSingleton singleton = null;

	private DoubleCheckSingleton() {

	}

	public static DoubleCheckSingleton getInstance() {
		if (singleton == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (singleton == null) {
					singleton = new DoubleCheckSingleton();
				}
			}
		}
		return singleton;
	}
}
