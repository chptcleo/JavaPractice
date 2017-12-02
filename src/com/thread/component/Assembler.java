package com.wallace.thread.component;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Assembler implements Runnable {

	private CyclicBarrier barrier = new CyclicBarrier(4);

	private Car car;

	private CarQueue chassisQueue;

	private CarQueue finishingQueue;

	private RobotPool robotPool;

	public Assembler(CarQueue chassisQueue, CarQueue finishingQueue,
			RobotPool robotPool) {
		this.chassisQueue = chassisQueue;
		this.finishingQueue = finishingQueue;
		this.robotPool = robotPool;
	}

	public Car car() {
		return car;
	}

	@Override
	public void run() {
		try {
			car = chassisQueue.take();
			robotPool.hire(EngineRobot.class, this);
			robotPool.hire(DriveTrainRobot.class, this);
			robotPool.hire(WheelRobot.class, this);
			barrier.await();
			finishingQueue.add(car);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("Assembler off");
	}

	public CyclicBarrier barrier() {

		return barrier;
	}

}
