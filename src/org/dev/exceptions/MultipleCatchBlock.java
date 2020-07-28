package org.dev.exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MultipleCatchBlock {

	static public void main(String[] args) {

		// try with "" or "Hundred" or "12.5" or close line sc.clsoe()

		String str = "12.56";
		Scanner scanner = new Scanner(str);

		int i = 0;

		try {
			i = scanner.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println(ime);
			ime.printStackTrace();
		} catch (NoSuchElementException nsee) {
			System.out.println(nsee);
			nsee.printStackTrace();
		} catch (IllegalStateException ise) {
			System.out.println(ise);
			ise.printStackTrace();
		} finally {
			System.out.println("Close scanner");
			scanner.close();
		}

		System.out.println("i=" + i);
	}
}
