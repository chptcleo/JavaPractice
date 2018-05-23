package com.pattern.creational.singleton;

public class VolatileSingleton {

	private static volatile VolatileSingleton singleton = null;

	private VolatileSingleton() {

	}

	public static VolatileSingleton getInstance() {
		if (singleton == null) {
			synchronized (VolatileSingleton.class) {
				if (singleton == null) {
					// define volatile to avoid command resort for below cause
					singleton = new VolatileSingleton();
				}
			}
		}
		return singleton;
	}
}
