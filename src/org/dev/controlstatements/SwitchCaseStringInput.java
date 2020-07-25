package org.dev.controlstatements;

import java.util.Scanner;

public class SwitchCaseStringInput {

	public static void main(String[] args) {

		System.out.println("Enter the country code");
		Scanner scanner = new Scanner(System.in);
		String countryCode = scanner.nextLine();

		// Convert input into lower case
		countryCode = countryCode.toLowerCase();
		scanner.close();

		switch (countryCode) {
		case "ind":
			System.out.println("India");
			break;
		case "jpn":
			System.out.println("Japan");
			break;
		case "aus":
			System.out.println("Australia");
			break;
		default:
			System.out.println("Invlaid Code");
			break;
		}
	}
}
