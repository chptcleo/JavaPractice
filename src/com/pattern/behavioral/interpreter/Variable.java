package com.pattern.behavioral.interpreter;

public class Variable implements Expression {

	private String name;

	public Variable(String name) {
		this.name = name;
	}

	public boolean interpret(Context ctx) {
		// TODO Auto-generated method stub
		return ctx.equals(this);
	}

	public boolean equals(Object o) {
		if (o != null && o instanceof Variable) {
			return this.name.equals(((Variable) o).name);
		}
		return false;
	}

	public int hashCode() {
		return this.toString().hashCode();
	}

	public String toString() {
		return name;
	}
}
