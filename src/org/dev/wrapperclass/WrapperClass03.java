package org.dev.wrapperclass;

public class WrapperClass03 {

	public static void main(String[] args) {

		int i = 100;
		Integer intObj1 = new Integer(i);// Boxing operation
		System.out.println("intObj1=" + intObj1);

		int j = intObj1.intValue();// Unboxing operation
		System.out.println("j=" + j);

		double d1 = intObj1.doubleValue();// Unboxing and autowidening
		System.out.println("d1=" + d1);

		// 1st way
		Double dd1 = new Double(d1);
		System.out.println("dd1=" + dd1);

		// 2nd way
		Double dd2 = d1;
		System.out.println("dd2=" + dd2);

		System.out.println("=== Unboxing ===");
		int i1 = dd1.intValue();// Unboxing and narrowing
		System.out.println("i1=" + i1);

		System.out.println("=== Unboxing & Explicit narrowing ===");
		int i2 = (int) dd1.doubleValue();
		System.out.println("i2=" + i2);

		byte b1 = 123;
		Long l1 = new Long(i);// autowidening
		Long l2 = new Long(b1);// autowidening
		System.out.println("l1=" + l1);
		System.out.println("l2=" + l2);

		long l3 = 100;
		Byte b2 = new Byte((byte) l3);
		System.out.println("b2=" + b2);

		System.out.println("Converting object to string");
		String s1 = l1.toString();
		System.out.println("s1=" + s1);
		System.out.println("======================");

		Double d2 = new Double(100);
		String s2 = d2.toString();// Object to String
		System.out.println("s2=" + s2);

		Double.toString(10.22);// Primitive to String
		Long.toString(1001);// Primitive to String
		System.out.println("======================");

		Byte.toString((byte) 100);

//		String s3 = l1;// Cannot convert from Long to String, assigning l1 address to s3;

//		Add two String containing numbers & put in another String

		String s11 = "123";
		String s22 = "456";

		String s33 = Integer.toString(Integer.parseInt(s11)) + Integer.toString(Integer.parseInt(s22));
		System.out.println("s33=" + s33);

		Integer i3 = new Integer(123);
		Integer i4 = i3;// Assigning the address
		System.out.println("i3==i4 " + (i3 == i4));
		System.out.println("i4=" + i4);
		Integer ii3 = Integer.valueOf(i3);// Returning a new Integer object
		System.out.println(i3 == ii3);

	}
}
