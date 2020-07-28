package org.dev.exceptions;

public class StackUnwiding {

	public static void main(String[] args) {
		StackUnwiding ec = new StackUnwiding();
		ec.test1();
	}

	void test1() {
		test2();
	}

	void test2() {
		test3();
	}

	void test3() {
		test4();
	}

	void test4() {
		int i = 10 / 0;
		System.out.println("i=" + i);
	}
}
