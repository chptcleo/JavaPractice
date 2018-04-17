package com.thread.basic;

public class SynchronizedThread {

	private int x;

	private synchronized void inc() {
		try {
			System.out.println(Thread.currentThread().getName() + " start to increase x from " + x);
			x++;
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " increased x to " + x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private synchronized void dec() {
		try {
			System.out.println(Thread.currentThread().getName() + " start to decrease x from " + x);
			x--;
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " decreased x to " + x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	class IncThread implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			inc();
		}

	}

	class DecThread implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			dec();
		}

	}

	private void operate() {
		new Thread(new IncThread()).start();
		new Thread(new DecThread()).start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedThread multipleThread = new SynchronizedThread();
		multipleThread.operate();
	}

}
