package com.pattern.structural.bridge;

public class ImplementorA implements Implementor {

	public void operationImpl() {
		// TODO Auto-generated method stub
		System.out.println("ImplementorA operationImpl");
	}

	@Override
	public void actionImpl() {
		// TODO Auto-generated method stub
		System.out.println("ImplementorA actionImpl");
	}

}
