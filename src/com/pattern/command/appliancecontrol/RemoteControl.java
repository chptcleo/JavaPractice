package com.pattern.command.appliancecontrol;

public class RemoteControl {

	private Command[] onCmds;

	private Command[] offCmds;

	private Command undoCmd;

	public RemoteControl() {
		onCmds = new Command[3];
		offCmds = new Command[3];
	}

	public void setCmd(int slot, Command onCmd, Command offCmd) {
		onCmds[slot] = onCmd;
		offCmds[slot] = offCmd;
	}

	public void onButtonIsPressed(int slot) {
		onCmds[slot].execute();
		undoCmd = onCmds[slot];
	}

	public void offButtonIsPressed(int slot) {
		offCmds[slot].execute();
		undoCmd = offCmds[slot];
	}

	public void undoButtonIsPressed() {
		undoCmd.undo();
	}

}
