package org.dev.innerclasses;

public class InnerStaticClass {

	private static void outerMethod() {
		System.out.println("Inside outer method");
	}

	static class Inner {
		public static void main(String[] args) {

			System.out.println("Inside inner class method");
			outerMethod();
		}
	}
}
