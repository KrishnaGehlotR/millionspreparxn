package org.dev.innerclasses;

class Outer1 {

	class Inner {

		public void show() {
			System.out.println("In a nested class method");
		}
	}
}

public class NestedInnerClass {

	public static void main(String[] args) {

		Outer1.Inner inner = new Outer1().new Inner();
		inner.show();
	}
}
