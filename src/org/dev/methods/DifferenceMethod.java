package org.dev.methods;

public class DifferenceMethod {

	public static void main(String[] args) {
		double diff = getDifference(234.4, 34.5);
		System.out.println(diff);
	}

	public static double getDifference(double d1, double d2) {
		double diff = d1 - d2;
		return diff;
	}
}
