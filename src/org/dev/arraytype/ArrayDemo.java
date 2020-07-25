package org.dev.arraytype;

public class ArrayDemo {

	public static void main(String[] args) {

		System.out.println("=====> Number array");
		int numArr[] = new int[3];
		numArr[0] = 10;
		numArr[1] = 20;
		numArr[2] = 30;

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}

		System.out.println("=====> String array");
		String[] strNum = new String[3];
		strNum[0] = "I";
		strNum[1] = "Love";
		strNum[2] = "Java";

		for (String str : strNum) {
			System.out.println(str);
		}
	}
}
