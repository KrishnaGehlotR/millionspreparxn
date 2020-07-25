package org.dev.typecasting;

interface IDemo05 {
	void test1();
}

interface IDemo051 {
	void test2();
}

class ConDemo05 implements IDemo05, IDemo051 {

	@Override
	public void test1() {
		System.out.println("test1() implemented in ConDemo05");
	}

	@Override
	public void test2() {
		System.out.println("test2() implemented in ConDemo05");
	}
}

public class InterfacePointsCasting {

	public static void main(String[] args) {

		IDemo05 id5 = new ConDemo05();
		id5.test1();
//		id5.test2();// Not access (Invisible)

		IDemo051 id51 = new ConDemo05();
//		id51.test1();// Not access (Invisible)
		id51.test2();
	}
}
