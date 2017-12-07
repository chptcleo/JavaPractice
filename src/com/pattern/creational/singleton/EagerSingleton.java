package com.pattern.creational.singleton;

public class EagerSingleton {

	private static EagerSingleton m_instance = new EagerSingleton();
	
	private EagerSingleton(){
		
	}
	
	public static EagerSingleton getInstance(){
		
		return m_instance;
	}
}
