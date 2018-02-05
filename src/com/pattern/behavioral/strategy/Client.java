package com.pattern.behavioral.strategy;

public class Client {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strategy sa = new ConcreteStrategyA();
		Context context = new Context();
		context.setStrategy(sa);
		context.process();
		Strategy sb = new ConcreteStrategyB();
		context.setStrategy(sb);
		context.process();
	}

}
