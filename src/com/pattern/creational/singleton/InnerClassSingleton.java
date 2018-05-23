package com.pattern.creational.singleton;

public class InnerClassSingleton {

	private static class SingletonHolder {
		public static InnerClassSingleton instance = new InnerClassSingleton();
	}

	private InnerClassSingleton() {

	}

	public static InnerClassSingleton getInstance() {
		return SingletonHolder.instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
