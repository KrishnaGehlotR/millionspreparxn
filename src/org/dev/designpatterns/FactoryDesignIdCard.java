package org.dev.designpatterns;

import java.util.Scanner;

interface IdCard {
	void swipe();
}

class SbiImpl implements IdCard {

	@Override
	public void swipe() {
		System.out.println("SBI card swiped");
	}

}

class HdfcImpl implements IdCard {

	@Override
	public void swipe() {
		System.out.println("HDFC card swiped");
	}

}

class BankFactory {

	public static IdCard getMoney(String cardType) {

		if (cardType == null) {
			return null;
		}

		if (cardType.equalsIgnoreCase("SBI")) {
			return new SbiImpl();
		} else if (cardType.equalsIgnoreCase("HDFC")) {
			return new HdfcImpl();
		} else {
			System.out.println("Insert properly");
			return null;
		}
	}
}

public class FactoryDesignIdCard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter card");

		String type = sc.next();
		sc.close();

		IdCard money = BankFactory.getMoney(type);

		if (money != null) {
			money.swipe();
		}
	}
}
