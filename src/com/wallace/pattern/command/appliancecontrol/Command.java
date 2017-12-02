package com.wallace.pattern.command.appliancecontrol;

public interface Command {

	public void execute();
	
	public void undo();
}
