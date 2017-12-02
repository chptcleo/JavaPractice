package com.wallace.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

	PersonBean person;

	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {

		if (arg1.getName().equals("setHotOrNotRating")) {
			throw new IllegalAccessException();
		} else {
			return arg1.invoke(person, arg2);
		}
	}

}
