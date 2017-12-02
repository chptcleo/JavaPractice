package com.wallace.thread.component;

import java.util.concurrent.TimeUnit;

public class ChassisBuilder implements Runnable {

	private CarQueue carQueue;

	private int counter = 0;

	public ChassisBuilder(CarQueue carQueue) {
		this.carQueue = carQueue;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				TimeUnit.MILLISECONDS.sleep(500);
				Car car = new Car(++counter);
				System.out.println("ChassisBuilder created " + car);
				carQueue.add(car);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ChassisBuilder off");
	}

}
