package org.dev.innerclasses;

public class InnerClassD {

	class D {

		// The fieid i cannot be declared static in a non-static inner type, unless
		// initialized with constant expression
		// static int i = 10;

		// The method test cannot be declared static; static methods can only be
		// declared in a static or top level type
		// public static void test() {
		// System.out.println("From test()");
		// }

	}

	public static void main(String[] args) {

		InnerClassD icD = new InnerClassD();
		D d1 = icD.new D();
		System.out.println(d1);
//		d1.test();
	}
}
