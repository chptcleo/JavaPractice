package com.wallace.thread.source;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable {

	private IntGenerator intGenerator;

	@SuppressWarnings("unused")
	private final int id;

	public EvenChecker(IntGenerator intGenerator, int id) {
		this.intGenerator = intGenerator;
		this.id = id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!intGenerator.isCanceled()) {
			int val = intGenerator.next();
			if (val % 2 != 0) {
				System.out.println(val + " is not even");
				intGenerator.cancel();
			}
		}
	}

	public static void test(IntGenerator intGenerator, int count) {
		System.out.println("start...");
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < count; i++) {
			exec.execute(new EvenChecker(intGenerator, i));
		}
		exec.shutdown();
	}

}
