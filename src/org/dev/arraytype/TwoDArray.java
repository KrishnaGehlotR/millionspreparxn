package org.dev.arraytype;

public class TwoDArray {

	public static void main(String[] args) {

		int arr1[][] = new int[3][3];
		int val = 10;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = val;
				val += 10;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
