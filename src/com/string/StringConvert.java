package com.string;

public class StringConvert {
	
	private void convertToBuffer() {
		String x = "abcdefg";
		StringBuffer stringBuffer = new StringBuffer(x);
		stringBuffer.reverse();
		System.out.println(stringBuffer.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringConvert().convertToBuffer();
	}

}
