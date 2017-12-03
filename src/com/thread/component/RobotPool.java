package com.thread.component;

import java.util.HashSet;
import java.util.Set;

public class RobotPool {

	private Set<Robot> pool = new HashSet<Robot>();

	public synchronized void add(Robot r) {
		pool.add(r);
	}

	public synchronized void hire(Class<? extends Robot> robotType, Assembler d) {
		try {
			for (Robot robot : pool) {
				if (robot.getClass().equals(robotType)) {
					pool.remove(robot);
					robot.assignAssembler(d);
					robot.engage();
					return;
				}
				wait();
				hire(robotType, d);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void release(Robot robot) {
		pool.add(robot);
	}
}
