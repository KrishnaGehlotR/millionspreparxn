package org.dev.constructors;

class B {

	byte b;
	short s;

	B(byte c) {
		b = c;
	}

	B(short t) {
		s = t;
	}
}

public class ConstructorByteShort {

	public static void main(String[] args) {

		B b1 = new B((byte) 100);
		System.out.println(b1.b);
		System.out.println(b1.s);

		B b2 = new B((short) 200);
		System.out.println(b2.b);
		System.out.println(b2.s);
	}
}
