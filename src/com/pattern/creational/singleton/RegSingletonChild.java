package com.pattern.creational.singleton;

public class RegSingletonChild extends RegSingleton{
	
	public static RegSingletonChild getInstance(){
		
		return (RegSingletonChild) RegSingleton
				.getInstanc("com.singleton.RegSingletonChild");
	}
}
