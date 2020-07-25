package org.dev.stringclass;

public class StringClass {

	// Basically values can be assigned in two ways
	public static void main(String[] args) {

		String s1 = "Hello";// Constant pool
		String s2 = new String("Bangalore");// Non Constant Pool
		System.out.println(s1 + " " + s2);
	}
}
