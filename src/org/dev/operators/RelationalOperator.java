package org.dev.operators;

public class RelationalOperator {

	public static void main(String[] args) {

		int x = 5, y = 8;

		boolean res = x == y;// false
		System.out.println(res);

		res = x > y;// false
		System.out.println(res);

		res = x < y;// true
		System.out.println(res);

		res = x != y;// true
		System.out.println(res);

		res = x >= y;// false
		System.out.println(res);

		res = x <= y;// true
		System.out.println(res);

		System.out.println("=================");

		int x1, y1, z1;
		x1 = y1 = z1 = 100;// int a=b=c=100;Not possible, CTE Error
		int a = 100, b = 100, c = 100;

		System.out.println(x1 == 100);// true
		System.out.println(x1 = 100);// x1=100
		System.out.println("x1=" + x1);// 100
		System.out.println(true);// true
		System.out.println(100);// 100
		System.out.println("a=" + a + " b=" + b + " c=" + c);// a=100 b=100 c=100
		System.out.println(y1);// 100
		System.out.println(z1);// 100
	}
}
