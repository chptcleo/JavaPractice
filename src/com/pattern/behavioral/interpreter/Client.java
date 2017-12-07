package com.pattern.behavioral.interpreter;

public class Client {

	private static Context ctx;
	
	private static Expression exp;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ctx = new Context();
		Variable x = new Variable("x");
		Variable y = new Variable("y");
		Constant c = new Constant(true);
		ctx.assign(x, false);
		ctx.assign(y, true);
		exp = new Or(new And(c,x), new And(y,new Not(x)));
		System.out.println("x = "+x.interpret(ctx));
		System.out.println("y = "+y.interpret(ctx));
		System.out.println(exp.toString() + "=" + exp.interpret(ctx));
	}

}
