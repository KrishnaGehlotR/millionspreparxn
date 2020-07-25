package org.dev.arraytype;

public class ArrayIteration {

	public static void main(String[] args) {

		int arr1[] = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr[" + i + "]=" + arr1[i]);
		}
		System.out.println("=========");

		int arr2[];
		arr2 = new int[5];

		int val = 10;
		for (int j = 0; j < arr2.length; j++) {
//			System.out.println(arr2[j]);
			System.out.println(arr2[j] + (val += 10));
		}
		System.out.println("=========");

		// For each loop
		int arr3[] = { 10, 20, 30, 40, 50 };
		for (int a : arr3) {
			System.out.println(a);
		}
	}
}
