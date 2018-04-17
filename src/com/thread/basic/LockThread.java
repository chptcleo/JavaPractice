package com.thread.basic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockThread {

	private Lock locker = new ReentrantLock();

	private Integer x = new Integer(0);

	private void inc() {
		try {
			locker.lock();
			System.out.println(Thread.currentThread().getName() + " start to increase x from " + x);
			x++;
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " increased x to " + x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			locker.unlock();
		}
	}

	private void dec() {
		try {
			locker.lock();
			System.out.println(Thread.currentThread().getName() + " start to decrease x from " + x);
			x--;
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " decreased x to " + x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			locker.unlock();
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
		LockThread lockThread = new LockThread();
		lockThread.operate();
	}

}
