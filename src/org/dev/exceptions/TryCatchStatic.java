package org.dev.exceptions;

import java.util.Scanner;

public class TryCatchStatic {

	static String test() {

		int i = 10;
		int j;

		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter your input");
			int n = sc.nextInt();
			j = i / n;
			System.out.println("j=" + j);
			return "Pass";
		} catch (Exception e) {
			e.printStackTrace();
			return "Fail";
		}
	}

	public static void main(String[] args) {

		System.out.println("Main Start");
		System.out.println(test());
		System.out.println("Main End");
	}
}
