package com.pattern.behavioral.interpreter;

public class Or implements Expression {

	private Expression left, right;

	public Or(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public boolean interpret(Context ctx) {
		// TODO Auto-generated method stub
		return left.interpret(ctx) || right.interpret(ctx);
	}

	public boolean equals(Object o) {
		if (o != null && o instanceof Or) {
			return this.left.equals(((Or) o).left)
					&& this.right.equals(((Or) o).right);
		}
		return false;
	}

	public int hashCode() {
		return this.toString().hashCode();
	}

	public String toString() {
		return "(" + this.left.toString() + "Or" + this.right.toString() + ")";
	}

}
