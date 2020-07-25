package org.dev.typecasting;

abstract class AbDemo02 {

	void test1() {
		System.out.println("test1() of class AbDemo02");
	}

	abstract void test2();
}

abstract class AbDemo021 extends AbDemo02 {

	void test2() {
		System.out.println("test2() implemented in class AbDemo021");
	}

	abstract void test3();
}

class ConDemo02 extends AbDemo021 {

	void test3() {
		System.out.println("test3() implemented in ConDemo02");
	}
}

public class AbConDemo02 {

	public static void main(String[] args) {

		AbDemo02 ab1 = new ConDemo02();
		ab1.test1();
		ab1.test2();
		System.out.println("--------------------------------------");

		AbDemo021 ab2 = new ConDemo02();
		ab2.test1();
		ab2.test2();
		ab2.test3();
	}
}
