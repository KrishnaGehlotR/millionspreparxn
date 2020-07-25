package org.dev.objectclass;

class D {

}

public class EqualsMethod {

	public static void main(String[] args) {

		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);
		System.out.println("=================================");

		System.out.println(d1 == d3);// Equals method not overridden
		System.out.println(d1.equals(d3));// Hence will compare address
		System.out.println("=================================");

		d1 = d3;
		System.out.println(d1 == d3);// Equals method not overridden
		System.out.println(d1.equals(d3));// Hence will compare address
		System.out.println("=================================");

		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);
		System.out.println("=================================");

		// For understanding
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
