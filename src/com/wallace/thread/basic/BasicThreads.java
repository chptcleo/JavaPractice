package com.wallace.thread.basic;

public class BasicThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			new Thread(new LiftOff()).start();
		}
	}

}
