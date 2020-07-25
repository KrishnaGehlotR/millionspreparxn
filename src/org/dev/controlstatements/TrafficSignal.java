package org.dev.controlstatements;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {

		System.out.println("Enter the color");
		Scanner input = new Scanner(System.in);
		String color = input.nextLine();
		color = color.toLowerCase();

		switch (color) {
		case "red":
			System.out.println("Stop");
			break;
		case "green":
			System.out.println("Proceed");
			break;
		case "orange":
			System.out.println("Caution");
			break;
		default:
			System.out.println("Invalid");
		}

		input.close();
	}
}
