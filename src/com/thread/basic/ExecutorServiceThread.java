package com.thread.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceThread {

	private ExecutorService fixedExecutorService = Executors.newFixedThreadPool(3);

	private ExecutorService cachedExecutorService = Executors.newCachedThreadPool();

	private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

	private ExecutorService singleExecutorService = Executors.newSingleThreadExecutor();

	public static void main(String[] args) {
		new ExecutorServiceThread().operate();
	}

	private void operate() {
		for (int i = 0; i < 5; i++) {
			fixedExecutorService.execute(new MyJob());
		}
		fixedExecutorService.shutdown();
//		for (int i = 0; i < 5; i++) {
//			cachedExecutorService.execute(new MyJob());
//		}
//		cachedExecutorService.shutdown();
//		for (int i = 0; i < 5; i++) {
//			scheduledExecutorService.schedule(new MyJob(), 3, TimeUnit.SECONDS);
//		}
//		scheduledExecutorService.shutdown();
//		for (int i = 0; i < 5; i++) {
//			singleExecutorService.execute(new MyJob());
//		}
//		singleExecutorService.shutdown();
	}

	private void execute() {
		System.out.println(Thread.currentThread().getName() + " execute start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " execute end");
	}

	class MyJob implements Runnable {

		@Override
		public void run() {
			execute();
		}
	}
}
