package com.behavioral.interpreter;

public interface Expression {

	public boolean interpret(Context ctx);
	
	public boolean equals(Object o);
	
	public int hashCode();
	
	public String toString();
}
