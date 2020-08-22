package org.dev.innerclasses;

public class InnerClassF {

	class F {

		F() {
			System.out.println("From F");
		}
	}

	public static void main(String[] args) {

		InnerClassF icF = new InnerClassF();
		icF.new F();
	}
}
