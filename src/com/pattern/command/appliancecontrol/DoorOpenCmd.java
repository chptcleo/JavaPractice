package com.pattern.command.appliancecontrol;

public class DoorOpenCmd implements Command {

	private Door door;

	public DoorOpenCmd(Door door) {
		this.door = door;
	}

	@Override
	public void execute() {
		door.open();
	}

	@Override
	public void undo() {
		door.close();
	}

}
