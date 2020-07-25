package org.dev.arraytype;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int a[] = { 10, 3, 47, 04, 8 };
		System.out.println("Array elements before sort");

		for (int x : a) {
			System.out.println(x);
		}

		// 1st way of sorting arrays
		System.out.println("1st way array elements after sort");
		Arrays.sort(a);
		for (int x : a) {
			System.out.println(x);
		}

		// 2nd way of sorting arrays
		System.out.println("2nd way array elements after sort");
		System.out.println(Arrays.toString(a));
	}
}
