package org.dev.exceptions;

import java.util.Scanner;

public class TryWithResourceBlock {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {

			System.out.println("Enter your input");
			int i = sc.nextInt();
			System.out.println("i=" + i);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
