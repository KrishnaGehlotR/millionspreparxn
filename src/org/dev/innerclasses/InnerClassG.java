package org.dev.innerclasses;

public class InnerClassG {

	static int i = 10;

	class H extends InnerClassG {

		// The field j cannot be declared static in a non-static inner type, unless
		// initialized with a constant expression
		// static int j = 20;

		// The field i cannot be declared static in a non-static inner type, unless
		// initialized with a constant expression
		// static int i = 10;
	}

	public static void main(String[] args) {

		InnerClassG icG = new InnerClassG();
		H h1 = icG.new H();
		System.out.println(h1);
		System.out.println(H.i);
	}
}
