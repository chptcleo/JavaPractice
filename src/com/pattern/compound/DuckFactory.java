package com.pattern.compound;

public class DuckFactory extends AbstrackDuckFactory {

	@Override
	Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	Quackable createRedheadDuck() {
		return new ReadheadDuck();
	}

	@Override
	Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
