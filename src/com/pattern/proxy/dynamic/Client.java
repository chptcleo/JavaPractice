package com.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Client {

	private PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass()
				.getClassLoader(), person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}

	private PersonBean getNonOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass()
				.getClassLoader(), person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}

	private void drive() {
		PersonBean joe = new PersonBeanImpl();
		joe.setName("joe");
		joe.setGender("male");

		PersonBean joeOwnerProxy = getOwnerProxy(joe);
		joeOwnerProxy.setInterests("basketball");
		try {
			joeOwnerProxy.setHotOrNotRating(100);
		} catch (Exception e) {
			System.out
					.println("you can't invoke setHotOrNotRating by owner proxy");
		}
		PersonBean joeNonOwnerProxy = getNonOwnerProxy(joe);
		joeNonOwnerProxy.setHotOrNotRating(20);
		try {
			joeNonOwnerProxy.setInterests("dance");
		} catch (Exception e) {
			System.out
					.println("you can't invoke setInterests by none owner proxy");
		}

		System.out.println(joe.getName() + " " + joe.getGender() + " "
				+ joe.getInterests() + " " + joe.getHotOrNotRating());
	}

	public static void main(String[] args) {
		new Client().drive();
	}

}
