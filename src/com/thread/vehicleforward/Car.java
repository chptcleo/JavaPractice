package com.thread.vehicleforward;

public class Car implements Vehicle {

	@Override
	public synchronized void forward() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " Car forward for 3 seconds.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Car forward done");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		forward();
	}

}
