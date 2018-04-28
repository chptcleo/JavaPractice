package com.string;

public class StringTesting {

	String x = "defga";
	private void check() {
		System.out.println(x);
		StringBuffer stringBuffer = new StringBuffer(x);
		stringBuffer.append("hi");
		System.out.println(stringBuffer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringTesting().check();
	}


}
