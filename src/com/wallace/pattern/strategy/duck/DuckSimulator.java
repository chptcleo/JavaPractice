package com.wallace.pattern.strategy.duck;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		rubberDuck.setFlyBehavior(new FlyWithRocket());
		rubberDuck.performFly();
	}

}
