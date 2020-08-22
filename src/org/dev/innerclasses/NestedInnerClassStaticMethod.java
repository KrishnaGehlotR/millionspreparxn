package org.dev.innerclasses;

class Outer2 {

	class Inner {

		// The method cannot be declared static; static methods can only be
		// declared in a static or top level type
		public /* static */ void show() {
			System.out.println("Inside inner class static method");
		}
	}
}

public class NestedInnerClassStaticMethod {

	public static void main(String[] args) {

		Outer2.Inner inner2 = new Outer2().new Inner();
		inner2.show();
	}
}
