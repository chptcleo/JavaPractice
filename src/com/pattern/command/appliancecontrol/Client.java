package com.pattern.command.appliancecontrol;

public class Client {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light();
		LightOnCmd lightOnCmd = new LightOnCmd(light);
		LightOffCmd lightOffCmd = new LightOffCmd(light);
		remoteControl.setCmd(0, lightOnCmd, lightOffCmd);

		Door door = new Door();
		DoorOpenCmd doorOpenCmd = new DoorOpenCmd(door);
		DoorCloseCmd doorCloseCmd = new DoorCloseCmd(door);
		remoteControl.setCmd(1, doorOpenCmd, doorCloseCmd);

		Stereo stereo = new Stereo();
		StereoOnCmd stereoOnCmd = new StereoOnCmd(stereo);
		StereoOffCmd stereoOffCmd = new StereoOffCmd(stereo);
		remoteControl.setCmd(2, stereoOnCmd, stereoOffCmd);

		remoteControl.onButtonIsPressed(1);
		remoteControl.undoButtonIsPressed();
		remoteControl.offButtonIsPressed(2);
		remoteControl.undoButtonIsPressed();
	}

}
