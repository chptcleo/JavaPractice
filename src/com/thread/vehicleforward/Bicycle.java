package com.thread.vehicleforward;

public class Bicycle implements Vehicle {

	@Override
	public synchronized void forward() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " Bicycle forward for 10 seconds.");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Bicycle forward done");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		forward();
	}

}
