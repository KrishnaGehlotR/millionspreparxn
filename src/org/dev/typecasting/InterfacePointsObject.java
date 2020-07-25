package org.dev.typecasting;

interface IDemo04 {

	abstract void test01();
}

class ConDemo04 implements IDemo04 {

	@Override
	public void test01() {
		System.out.println("test01 implemented in ConDemo04");
	}
}

public class InterfacePointsObject {

	public static void main(String[] args) {

		IDemo04 id4 = new ConDemo04();
		id4.test01();
	}
}
