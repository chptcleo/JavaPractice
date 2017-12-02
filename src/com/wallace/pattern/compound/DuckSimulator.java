package com.wallace.pattern.compound;

public class DuckSimulator {

	public static void main(String[] args) {
		AbstrackDuckFactory duckFactory = new CountingDuckFactory();
		new DuckSimulator().simulate(duckFactory);
	}

	void simulate(AbstrackDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable readheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("Duck simulator");

		Flock duckFlock = new Flock();
		duckFlock.add(gooseDuck);
		duckFlock.add(rubberDuck);
		duckFlock.add(duckCall);
		duckFlock.add(readheadDuck);

		Flock mallardDuckFlock = new Flock();
		mallardDuckFlock.add(mallardDuck);
		mallardDuckFlock.add(duckFactory.createMallardDuck());
		mallardDuckFlock.add(duckFactory.createMallardDuck());
		mallardDuckFlock.add(duckFactory.createMallardDuck());

		duckFlock.add(mallardDuckFlock);

		System.out.println("\nwhole ducks quack");

		Observer quackologistOne = new Quackologist();
		Observer quackologistTwo = new Quackologist();
		duckFlock.registerObserver(quackologistOne);
		duckFlock.registerObserver(quackologistTwo);
		simulate(duckFlock);

		System.out.println("\nmallard ducks quack");
		simulate(mallardDuckFlock);

		System.out.println("\nThe ducks quack "
				+ QuackCounter.getNumberOfQuack() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
