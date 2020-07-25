package org.dev.stringclass;

public class ConstantNonConstantPool {

	public static void main(String[] args) {

		String s1 = "Java";// Constant Pool
		String s2 = new String("Developer");// Non Constant Pool
		System.out.println("s1= " + s1);
		System.out.println("s2= " + s2);

		String s3 = "Java";// Constant Pool
		String s4 = new String("Developer");// Non Constant Pool
		System.out.println("s3= " + s3);
		System.out.println("s4= " + s4);

		System.out.println("s1==s3 " + (s1 == s3));
		System.out.println("s2==s4 " + (s2 == s4));

		String s5 = new String("Java");
		System.out.println("s1 == s5 " + (s1 == s5));
		System.out.println("s1.equals(s5) " + s1.equals(s5));
	}
}
