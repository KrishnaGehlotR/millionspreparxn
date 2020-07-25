package org.dev.controlstatements;

import java.util.Scanner;

public class SwithCaseCharInput {

	public static void main(String[] args) {

		System.out.println("Enter the country code");
		Scanner input = new Scanner(System.in);
		String countryCode = input.nextLine();

		// Convert the input toLowerCase
		countryCode = countryCode.toLowerCase();

		char cCode = countryCode.charAt(0);

		switch (cCode) {
		case 'i':
			System.out.println("India");
			break;
		case 'j':
			System.out.println("Japan");
			break;
		case 'a':
			System.out.println("Australia");
			break;
		default:
			System.out.println("Invlaid Code");
			break;
		}

		input.close();
	}
}
