package org.dev.innerclasses;

// We can have more than 1 static inner class
public class InnerStaticClassDE {

	static class D {
		int j = 10;
	}

	static class E {
		int k = 20;
	}

	public static void main(String[] args) {

		D d1 = new D();
		E e1 = new E();

		System.out.println(d1.j);
		System.out.println(e1.k);
	}
}
