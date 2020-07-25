package org.dev.typecasting;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {

		int i = 100;
		long l = i;// Auto widening
		System.out.println("l=" + l);

		byte b;
		b = (byte) l;// Explicit narrowing
		System.out.println("b=" + b);

		l = 130;
		b = (byte) l;
		System.out.println("b=" + b);

		l = 260;
		b = (byte) l;
		System.out.println("b=" + b);

		double d = 12.44;
		int k = (int) d;// Explicit narrowing
		System.out.println("k=" + k);

		char ch = 25;// Assigning char equal to unicode no 25
		System.out.println("ch=" + ch);

		int i1 = 65;
		char ch1 = (char) i1;
		System.out.println("ch1=" + ch1);

		double d1 = 65.43;
		char ch2 = (char) d1;
		System.out.println("ch2=" + ch2);

		long l1 = 100;
		char ch3 = (char) l1;// Cannot be done, as char expects only char or number
		System.out.println("ch3=" + ch3);

		double dd = 100;
		System.out.println("dd=" + dd);

		int ii = 1000;
		System.out.println("ii=" + ii);

		float f = 10.2f;
		long l2 = (long) (float) (long) (int) (short) (byte) f;
		System.out.println("l2=" + l2);

		double d12 = 0.0;
		int i12 = (int) (double) (byte) (short) (int) (long) d12;
		System.out.println("i12=" + i12);

		// int d13 = (double) (byte) (short) (int) f;
	}

}
