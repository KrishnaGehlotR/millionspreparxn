package org.dev.controlstatements;

import java.util.Scanner;

public class IfElseElectricityBills {

	public static void main(String[] args) {

		System.out.println("Enter the number of units");
		Scanner scanner = new Scanner(System.in);
		double units = scanner.nextDouble();

		System.out.println("Enter arrears if any else 0");
		double arrears = scanner.nextDouble();

		double amount = 0, discount = 0, fine = 0;

		if (units > 0 && units <= 50)
			amount = units * 1.20;
		else if (units > 50 && units <= 100)
			amount = (50 * 1.29) + (units - 50) * 2.40;
		else if (units > 100 && units <= 150)
			amount = (50 * 1.20) + (50 * 2.40) + (units - 150) * 3.60;
		else if (units > 150) {
			amount = (50 * 1.20) + (50 * 2.40) + (50 * 3.60) + (units - 150) * 4.80;
			if (units > 200)
				discount = amount * (5.0 / 100.0);
			if (discount > 200)
				discount = 200;
		}

		if (arrears > 0)
			fine = arrears * (10.0 / 100.0);
		double total_amount = amount + arrears + fine - discount;
		System.out.println("Total amount to be pay: " + total_amount);
		scanner.close();
	}
}
