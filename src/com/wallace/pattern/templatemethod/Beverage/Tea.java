package com.wallace.pattern.templatemethod.Beverage;

public class Tea extends CaffeineBeverage {

	boolean answer;

	public boolean isAnswer() {
		return answer;
	}

	public void setAnswer(boolean answer) {
		this.answer = answer;
	}

	@Override
	void brew() {
		System.out.println("tea brew");
	}

	@Override
	void addCondiments() {
		System.out.println("tea add condiments");
	}

	@Override
	boolean needCondiments() {
		if (answer) {
			return true;
		}
		return false;
	}

}
