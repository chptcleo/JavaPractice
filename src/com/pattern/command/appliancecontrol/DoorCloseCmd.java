package com.wallace.pattern.command.appliancecontrol;

public class DoorCloseCmd implements Command {

	private Door door;

	public DoorCloseCmd(Door door) {
		this.door = door;
	}

	@Override
	public void execute() {
		door.close();
	}

	@Override
	public void undo() {
		door.open();
	}

}
