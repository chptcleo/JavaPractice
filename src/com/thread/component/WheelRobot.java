package com.thread.component;

public class WheelRobot extends Robot {

	public WheelRobot(RobotPool pool) {
		super(pool);
	}

	@Override
	protected void performService() {
		System.out.println(this + " installing wheel");
		assembler.car().addWheels();
	}

}
