package com.pattern.behavioral.strategy;

public class Context {

	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void process() {
		strategy.operation();
	}
	
}
