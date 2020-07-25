package org.dev.abstractions;

interface IDemo17 {

	void test1();
}

interface IDemo18 {

	void test2();
}

abstract class IDemo19 implements IDemo17, IDemo18 {

	public void test1() {
		System.out.println("test1() implemented in class IDemo19");
	}
}

class IDemo20 extends IDemo19 {

	public void test2() {
		System.out.println("test2() implemented in class IDemo20");
	}

}

public class IDemo21 {

	public static void main(String[] args) {
		IDemo20 iDemo20 = new IDemo20();
		iDemo20.test1();
		iDemo20.test2();
	}
}
