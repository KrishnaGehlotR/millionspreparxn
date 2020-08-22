package org.dev.innerclasses;

class Outer3 {

	void outerMethod() {
		System.out.println("Inside outer method");

		// Inner class is local to outerMethod()

		class Inner {

			void innerMethod() {
				System.out.println("Inside inner method");
			}
		}

		Inner in = new Inner();
		in.innerMethod();
	}
}

public class InnerClassOuterMethod {

	public static void main(String[] args) {

		Outer3 outer3 = new Outer3();
		outer3.outerMethod();
	}
}
