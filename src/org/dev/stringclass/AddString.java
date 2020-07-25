package org.dev.stringclass;

public class AddString {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Developer";
		String s3 = s1 + s2;
		System.out.println("s3=" + s3);

		String s4 = "JavaDeveloper";
		System.out.println("s4=" + s4);

		String s5 = "Java" + "Developer";
		System.out.println("s5=" + s5);

		System.out.println(s3 == s5);
		System.out.println(s4 == s5);

		String s6 = s1 + "Developer";
		System.out.println(s3 == s6);
		System.out.println(s4 == s6);
		System.out.println(s4.equals(s6));
	}
}
