package org.dev.constructors;

class C {

	int i;

	C(int a) {
		i = a;
		System.out.println("i= " + i);
	}
}

public class ConstructorInvoke {

	public static void main(String[] args) {

		C c1 = new C(100);
		System.out.println(c1.i);

		C c2 = new C(200);
		System.out.println(c2.i);

		c1.i = 500;
		System.out.println(c1.i);
	}
}
