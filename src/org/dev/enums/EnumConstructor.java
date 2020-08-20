package org.dev.enums;

enum Payment3 {

	CHEQUE(1000), CREDITCARD(1500), DEBITCARD(2000);

	private int minPayment;

	Payment3(int i) {
		minPayment = i;
	}

	int getMinPayment() {
		return minPayment;
	}
}

public class EnumConstructor {

	public static void main(String[] args) {

		Payment3 pmt3;
		pmt3 = Payment3.CREDITCARD;

		System.out.println("Minimum payment for cheque is " + Payment3.CHEQUE.getMinPayment());

		System.out.println("Minimum payment for different modes");
		Payment3[] pmts = Payment3.values();

		for (Payment3 pmt : pmts) {
			System.out.println("For " + pmt + " is " + pmt.getMinPayment());
		}
	}
}
