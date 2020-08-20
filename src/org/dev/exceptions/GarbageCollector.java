package org.dev.exceptions;

public class GarbageCollector {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb);
		sb = null;// Eligible for collection

		String s1 = new String("Hello");
		String s2 = new String("Java");
		System.out.println(s1);
		s1 = s2;// Hello object is eligible for collection
		System.out.println(s1);
	}
}
