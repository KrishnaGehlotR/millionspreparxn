package org.dev.innerclasses;

public class InnerClassC {

	class C {

		public void test() {
			System.out.println("From test");
		}
	}

	public static void main(String[] args) {

		InnerClassC icC = new InnerClassC();
		C c1 = icC.new C();
		c1.test();
	}
}
