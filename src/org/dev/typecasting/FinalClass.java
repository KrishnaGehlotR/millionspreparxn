package org.dev.typecasting;

final class I {

	void test1() {
		System.out.println("test1() of class I");
	}
}

//The type J cannot subclass the final class I
//class J extends I {
//
//	void test2() {
//		System.out.println("test2() of class J");
//	}
//}

public class FinalClass {

	public static void main(String[] args) {

		I i = new I();
		i.test1();
	}
}
