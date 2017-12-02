package com.wallace.thread.component;

import java.util.concurrent.BrokenBarrierException;

public abstract class Robot implements Runnable {

	protected Assembler assembler;

	@SuppressWarnings("unused")
	private boolean engage = false;

	private RobotPool pool;

	public Robot(RobotPool pool) {
		this.pool = pool;
	}

	@Override
	public void run() {
		try {
			powerDown();
			while (!Thread.interrupted()) {
				performService();
				assembler.barrier().await();
				powerDown();
			}
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(this + " off");
	}

	@Override
	public String toString() {

		return getClass().getName();
	}

	abstract protected void performService();

	private synchronized void powerDown() {
		try {
			engage = false;
			assembler = null;
			pool.release(this);
			while (engage = false) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Robot assignAssembler(Assembler d) {
		this.assembler = d;
		return this;
	}

	public void engage() {
		engage = true;
		notifyAll();
	}

}
