package com.wallace.thread.source;

public abstract class IntGenerator {

	private boolean canceled = false;

	abstract int next();

	public void cancel() {
		canceled = true;
	}

	public boolean isCanceled() {
		return canceled;
	}
}
