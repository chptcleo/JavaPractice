package com.pattern.structural.proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject proxy = new ProxySubject();
		proxy.operation();
	}

}
