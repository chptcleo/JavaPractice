package com.thread.basic;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableThread {

	private ExecutorService executorService = Executors.newCachedThreadPool();

	public static void main(String[] args) {
		CallableThread callableThread = new CallableThread();
		callableThread.operateByThread();
		callableThread.operateByExecutorService();
		callableThread.operateByCompletionService();
	}

	private void operateByThread() {
		FutureTask<Integer> futureTask = new FutureTask<Integer>(new CallableTask());
		new Thread(futureTask).start();
		try {
			System.out.println("result is " + futureTask.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	private void operateByExecutorService() {
		FutureTask<Integer> futureTask = (FutureTask<Integer>) executorService.submit(new CallableTask());
		try {
			System.out.println("result is " + futureTask.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	private void operateByCompletionService() {
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);
		for (int i = 0; i < 3; i++) {
			completionService.submit(new CallableTask());
		}

		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("result is " + completionService.take().get());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	class CallableTask implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			System.out.println(Thread.currentThread().getName() + " invoke call method");
			return new Random().nextInt(10);
		}

	}

}
