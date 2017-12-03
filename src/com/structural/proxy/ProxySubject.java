package com.structural.proxy;

public class ProxySubject implements Subject {

	private RealSubject rs;

	public void operation() {
		// TODO Auto-generated method stub

		this.preOperation();
		if (rs == null) {
			rs = new RealSubject();
		}
		rs.operation();
		this.postOperation();
	}

	public void preOperation() {

	}

	public void postOperation() {

	}

}
