package org.dev.operators;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();

		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter your subject");
		String subject = sc.nextLine();

		String res = marks < 50 ? "Fail"
				: marks >= 50 && marks <= 59 ? "Pass"
						: marks >= 60 && marks <= 74 ? "First class"
								: marks >= 75 && marks <= 100 ? "Distinction" : "Not Found";
		System.out.println("Hello " + name + "  your result is " + res + " in subject " + subject);

		sc.close();
	}
}
