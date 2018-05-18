package com.shell;

import java.io.IOException;

public class ShellExecutor {

	public static void main(String[] args) {
		ShellExecutor shellExecutor = new ShellExecutor();
		shellExecutor.execute();
	}

	private void execute() {
		executeCommand("ls -lrt");
	}

	private void executeCommand(String command) {
		try {
			Process process = Runtime.getRuntime().exec(command);
			int rc = process.waitFor();
			System.out.println("rc: " + rc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
