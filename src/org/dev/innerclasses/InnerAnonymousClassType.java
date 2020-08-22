package org.dev.innerclasses;

class Demo1 {

	void show() {
		System.out.println("I am in show method of Demo1 class");
	}
}

public class InnerAnonymousClassType {

	// An anonymous class with Demo as base class
	static Demo1 d1 = new Demo1() {
		void show() {
			super.show();
			System.out.println("I am in InnerAnonymousClassType class");
		}
	};

	public static void main(String[] args) {
		d1.show();
	}
}
