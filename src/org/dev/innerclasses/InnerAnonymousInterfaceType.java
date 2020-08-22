package org.dev.innerclasses;

interface Hello {
	void show();
}

public class InnerAnonymousInterfaceType {

	static Hello hw = new Hello() {
		@Override
		public void show() {
			System.out.println("I am in anonymous class");
		}
	};

	public static void main(String[] args) {
		hw.show();
	}
}
