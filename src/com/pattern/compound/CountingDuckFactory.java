package com.pattern.compound;

public class CountingDuckFactory extends AbstrackDuckFactory {

	@Override
	Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	Quackable createRedheadDuck() {
		return new QuackCounter(new ReadheadDuck());
	}

	@Override
	Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
