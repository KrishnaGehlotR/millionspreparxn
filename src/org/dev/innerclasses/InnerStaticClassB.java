package org.dev.innerclasses;

public class InnerStaticClassB {

	static class B {

		static {
			System.out.println("SIB");
		}

		B() {
			System.out.println("Constructor");
		}

		{
			System.out.println("IIB");
		}

		public static void main(String[] args) {
			B b1 = new B();
			System.out.println(b1);
		}
	}
}
