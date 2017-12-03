package com.thread.component;

public class DriveTrainRobot extends Robot {

	public DriveTrainRobot(RobotPool pool) {
		super(pool);
	}

	@Override
	protected void performService() {
		System.out.println(this + " installing driveTrain");
		assembler.car().addDriveTrain();
	}

}
