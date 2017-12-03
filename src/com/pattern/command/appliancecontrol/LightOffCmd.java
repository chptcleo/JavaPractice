package com.pattern.command.appliancecontrol;

public class LightOffCmd implements Command {

	private Light light;

	public LightOffCmd(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
