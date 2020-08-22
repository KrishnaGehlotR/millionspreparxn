package org.dev.innerclasses;

class Outer4 {

	void outerMethod() {

		int x = 98;
		System.out.println("Inside outerMethod");

		class Inner {

			// Local inner class cannot access non-final local variable till JDK 1.7. Since
			// JDK 1.8, it is possible to access the non-final local variable in method
			// local inner class.
			void innerMethod() {
				System.out.println("x= " + x);
			}
		}

		Inner inner = new Inner();
		inner.innerMethod();
	}
}

public class InnerClassOuterMethodNonFinalVariable {

	public static void main(String[] args) {

		Outer4 outer4 = new Outer4();
		outer4.outerMethod();
	}
}
