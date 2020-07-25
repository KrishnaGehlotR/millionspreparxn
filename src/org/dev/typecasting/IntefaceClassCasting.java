package org.dev.typecasting;

interface IDemo07 {
	void test1();
}

interface IDemo08 extends IDemo07 {
	void test2();
}

class J implements IDemo08 {

	@Override
	public void test1() {
		System.out.println("test1() implemented in class J");
	}

	@Override
	public void test2() {
		System.out.println("test2() implemented in class J");
	}
}

public class IntefaceClassCasting {

	public static void main(String[] args) {

		IDemo07 id7 = new J();
		id7.test1();
		System.out.println("=========================");

		IDemo08 id8 = new J();
		id8.test1();
		id8.test2();
	}
}
