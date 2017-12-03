package com.thread.source;

public class EvenGenerator extends IntGenerator {

	private int currentEvenValue = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenChecker.test(new EvenGenerator(), 10);
	}

	@Override
	synchronized int next() {
		++currentEvenValue;
		Thread.yield();
		++currentEvenValue;

		return currentEvenValue;
	}

}
