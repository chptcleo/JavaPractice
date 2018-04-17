package com.thread.basic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NotifyThread {

	private Lock locker = new ReentrantLock();

	private Integer x = new Integer(0);

	private void inc() {
		try {
			synchronized (x) {
				x.wait();
				System.out.println(Thread.currentThread().getName() + " start to increase x from " + x);
				x++;
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " increased x to " + x);
				// x.notify();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void dec() {
		try {
			synchronized (x) {
				x.notify();
				System.out.println(Thread.currentThread().getName() + " start to decrease x from " + x);
				x--;
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName() + " decreased x to " + x);
				// x.wait();
			}
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
		NotifyThread notifyThread = new NotifyThread();
		notifyThread.operate();
	}

}
