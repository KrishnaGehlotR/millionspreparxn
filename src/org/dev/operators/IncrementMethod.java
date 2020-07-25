package org.dev.operators;

public class IncrementMethod {

	public static void main(String[] args) {
		int i = 0;
		int j;

		j = test(i) + ++i + i++;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
	}

	static int test(int a) {
		System.out.println("a=" + a++);
		return ++a;
	}
}
