package com.creational.singleton;

public class Client {

	public static void main(String[] args) {
		LazySingleton lazySingleton = LazySingleton.getInstance();
		System.out.println(lazySingleton.hashCode());
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		System.out.println(lazySingleton2.hashCode());
	}

}
