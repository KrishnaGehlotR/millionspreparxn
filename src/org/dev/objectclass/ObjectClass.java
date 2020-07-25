package org.dev.objectclass;

class Orange {

}

public class ObjectClass {

	public static void main(String[] args) {

		Orange o1 = new Orange();
		System.out.println(o1);// Print address
		System.out.println(o1.toString());// Address

		String s1 = new String("Hello");
		System.out.println(s1);// Prints value
		System.out.println(s1.toString());// Prints value
	}
}
