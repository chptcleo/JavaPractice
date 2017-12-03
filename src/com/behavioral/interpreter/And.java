package com.behavioral.interpreter;

public class And implements Expression {

	private Expression left, right;

	public And(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public boolean interpret(Context ctx) {
		// TODO Auto-generated method stub
		return left.interpret(ctx) && right.interpret(ctx);
	}

	public boolean equals(Object o) {
		if (o != null && o instanceof And) {
			return this.left.equals(((And) o).left)
					&& this.right.equals(((And) o).right);
		}
		return false;
	}

	public int hashCode() {
		return this.toString().hashCode();
	}

	public String toString() {
		return "(" + this.left.toString() + "AND" + this.right.toString() + ")";
	}

}
