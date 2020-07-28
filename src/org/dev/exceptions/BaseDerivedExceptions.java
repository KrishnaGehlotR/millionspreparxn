package org.dev.exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class BaseDerivedExceptions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter any input");
			sc.nextInt();
		} catch (NoSuchElementException | IllegalArgumentException iae) {
			iae.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
