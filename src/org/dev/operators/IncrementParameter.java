package org.dev.operators;

public class IncrementParameter {

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int c = a++ + b++ + test(b++);

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}

	static int test(int a) {
		a++;
		return a++;
	}
}
