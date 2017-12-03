package com.thread.component;

public class EngineRobot extends Robot {

	public EngineRobot(RobotPool pool) {
		super(pool);
	}

	@Override
	protected void performService() {
		System.out.println(this + " installing engine");
		assembler.car().addEngine();
	}

}
