package org.dev.enums;

enum Payment1 {
	CHEQUE, CREDITCARD, DEBITCARD
}

public class EnumDemo {

	public static void main(String[] args) {

		Payment1 pmt1;
		pmt1 = Payment1.CREDITCARD;
		System.out.println("Value of pmt: " + pmt1);

		pmt1 = Payment1.CHEQUE;

		switch (pmt1) {
		case CHEQUE:
			System.out.println("Payment made by: " + pmt1);
			break;
		case CREDITCARD:
			System.out.println("Payment made by: " + pmt1);
			break;
		case DEBITCARD:
			System.out.println("Payment made by: " + pmt1);
			break;
		}
	}
}
