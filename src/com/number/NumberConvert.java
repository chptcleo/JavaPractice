package com.number;

public class NumberConvert {
	
	private void convertStr() {
		String x = "2.22";
		double d = Double.parseDouble(x);
		System.out.println(d);
		d = Double.valueOf(x);
		System.out.println(d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NumberConvert().convertStr();
	}

}
