package com.creational.singleton;

import java.util.HashMap;

public class RegSingleton {

	private static HashMap<String, RegSingleton> m_registry = new HashMap<String, RegSingleton>();

	static {
		RegSingleton x = new RegSingleton();
		m_registry.put(x.getClass().getName(), x);
	}

	protected RegSingleton() {

	}

	public static RegSingleton getInstanc(String name) {

		if (name == null) {
			name = "com.singleton.RegSingleton";
		}
		if (m_registry.get(name) == null) {
			try {
				RegSingleton x = (RegSingleton) Class.forName(name)
						.newInstance();
				m_registry.put(name, x);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return m_registry.get(name);
	}
}
