package com.thread.basic;

public class DeadLock {

	private static Integer x = new Integer(0);

	private static Integer y = new Integer(0);

	private void incx() {
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

	private void decx() {
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

	private void incy() {
		try {
			System.out.println(Thread.currentThread().getName() + " start to increase y from " + y);
			y++;
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " increased y to " + y);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void decy() {
		try {
			System.out.println(Thread.currentThread().getName() + " start to decrease y from " + y);
			y--;
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " decreased y to " + y);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private synchronized void incAll() {
		while (true) {
			incx();
			incy();
		}
	}

	private synchronized void decAll() {
		while (true) {
			decy();
			decx();
		}
	}

	class LockThread1 implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Thread1 running");
			synchronized (DeadLock.x) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread1 locked x");
				synchronized (DeadLock.y) {
					System.out.println("Thread1 locked y");
				}
			}
		}

	}

	class LockThread2 implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Thread2 running");
			synchronized (DeadLock.y) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread2 locked y");
				synchronized (DeadLock.x) {
					System.out.println("Thread2 locked x");
				}
			}
		}

	}

	class IncThread implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			incAll();
		}

	}

	class DecThread implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			decAll();
		}

	}

	private void lock() {
		new Thread(new LockThread1()).start();
		new Thread(new LockThread2()).start();
	}

	private void operate() {
		Thread t1 = new Thread(new IncThread());
		Thread t2 = new Thread(new DecThread());
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock deadLock = new DeadLock();
		deadLock.lock();
		// deadLock.operate();
	}

}
