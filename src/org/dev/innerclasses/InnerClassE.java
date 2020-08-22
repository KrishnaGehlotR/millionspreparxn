package org.dev.innerclasses;

public class InnerClassE {

	int j = 20;

	class E {
		int i = 10;
	}

	public static void main(String[] args) {

		InnerClassE icE = new InnerClassE();
		System.out.println(icE.j);
		E e1 = icE.new E();

		System.out.println(e1.i);
		// System.out.println(e1.j);// j cannot be resolved or is not a field
	}
}
