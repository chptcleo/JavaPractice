package com.pattern.command.appliancecontrol;

public class StereoOnCmd implements Command {

	private Stereo stereo;

	public StereoOnCmd(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
	}

	@Override
	public void undo() {
		stereo.off();
	}

}
