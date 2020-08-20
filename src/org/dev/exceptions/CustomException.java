package org.dev.exceptions;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1824790079905956029L;

	public InvalidAgeException(String str) {
		System.out.println(str);
	}
}

public class CustomException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");

		int age = sc.nextInt();
		sc.close();

		try {
			if (age >= 60 || age <= 0)
				throw new InvalidAgeException("Invalid age: Please enter age between 1 to 59");

		} catch (InvalidAgeException iae) {
			iae.printStackTrace();
		}

		System.out.println("Age is entered " + age);
		System.out.println("Main method ends");

	}
}
