package org.dev.enums;

enum Payment2 {

	CHEQUE, CREDITCARD, DEBITCARD
}

public class PrintEnum {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Payment2 pmt2;

		pmt2 = Payment2.CREDITCARD;

		System.out.println("Printing all payment constants");

		Payment2[] pmts = Payment2.values();

		for (Payment2 pmt : pmts) {
			System.out.println(pmt);
		}
	}
}
