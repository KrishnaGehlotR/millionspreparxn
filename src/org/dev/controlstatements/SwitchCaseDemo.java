package org.dev.controlstatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		System.out.println("Enter the atomic number");
		Scanner scanner = new Scanner(System.in);
		int atomNo = scanner.nextInt();
		scanner.close();

		switch (atomNo) {
		case 1:
			System.out.println("Hydrogen");
			break;
		case 2:
			System.out.println("Helium");
			break;
		case 3:
			System.out.println("Lithium");
			break;
		case 4:
			System.out.println("Oxygen");
			break;
		default:
			System.out.println("I don't know");
			break;
		}

	}
}
