package com.pattern.command.appliancecontrol;

public class StereoOffCmd implements Command {

	private Stereo stereo;

	public StereoOffCmd(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
	}

}
