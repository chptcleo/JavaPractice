package com.pattern.command.appliancecontrol;

public class LightOnCmd implements Command {

	private Light light;

	public LightOnCmd(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
