package org.dev.typecasting;

abstract class AbDemo01 {

	void test1() {
		System.out.println("test1() of class AbDemo01");
	}

	abstract void test2();
}

class ConDemo01 extends AbDemo01 {

	void test2() {
		System.out.println("test2() implmented in ConDemo01");
	}

	void test3() {
		System.out.println("test3() implemented in ConDemo01");
	}
}

public class AbConDemo01 {

	public static void main(String[] args) {

		AbDemo01 ab = new ConDemo01();
		ab.test1();
		ab.test2();
//		ab.test3();// Not accessible of its own members
	}
}
