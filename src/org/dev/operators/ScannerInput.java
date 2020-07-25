package org.dev.operators;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = sc.nextLine();

		System.out.println("Enter the marks");
		int marks = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your subject");
		String subject = sc.nextLine();

		String res = marks > 50 ? "Pass" : "Fail";

		System.out.println("Hello " + name + " your result is " + res + " in subject " + subject);

		sc.close();
	}
}
