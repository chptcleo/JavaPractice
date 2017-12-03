package com.thread.basic;

import java.io.IOException;

public class ResponsiveUI extends Thread {

	private volatile static double d = 1;

	public ResponsiveUI() {
		// TODO Auto-generated constructor stub
		setDaemon(true);
		start();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new ResponsiveUI();
		System.in.read();
		System.out.println(d);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (d > 1) {
			d = d + (Math.PI + Math.E) / d;
		}
	}

}

class UnResponsiveUI {

	private double d = 1;

	public UnResponsiveUI() throws IOException {
		// TODO Auto-generated constructor stub
		while (d > 1) {
			d = d + (Math.PI + Math.E) / d;
			System.in.read();
		}
	}
}
