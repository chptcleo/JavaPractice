package com.thread.source;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicTest implements Runnable {

	private int i = 0;

	public synchronized int getValue() {
		return i;
	}

	private synchronized void evenIncrement() {
		i++;
		i++;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			evenIncrement();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicTest atomicTest = new AtomicTest();
		exec.execute(atomicTest);
		while (true) {
			int val = atomicTest.getValue();
			if (val % 2 != 0) {
				System.out.println(val);
				System.exit(0);
			}
		}
	}
}
