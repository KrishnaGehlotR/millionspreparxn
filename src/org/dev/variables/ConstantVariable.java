package org.dev.variables;

public class ConstantVariable {

	static final double PI = 3.14;// Constant value should be assigned in the same statement

	public static void main(String[] args) {

		final int NUM_WHEELS;
		NUM_WHEELS = 6;// Can be done in same line or different

		System.out.println(PI);
		System.out.println(NUM_WHEELS);

		// NUM_WHEELS = 8; will not work, cannot reassign
		// System.out.println(NUM_WHEELS);// a final variable
	}
}
