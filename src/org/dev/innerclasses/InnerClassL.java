package org.dev.innerclasses;

public class InnerClassL {

	class L {

		{
			System.out.println("From IIB");// Called first
		}

		L() {
			System.out.println("Constructor");
		}
	}

	public static void main(String[] args) {

		L l1 = new InnerClassL().new L();
		System.out.println(l1);
	}
}
