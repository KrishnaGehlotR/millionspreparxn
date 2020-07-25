package org.dev.controlstatements;

public class IfBlocks {

	public static void main(String[] args) {
		int age;
		age = 16;

		// Works, condition true
		if (age < 18) {
			System.out.println("Not eligible to vote");
		}

		// Works, condition true
		if (true) {
			System.out.println("True");
		}

		// Compilation error, Assignment used, boolean expected
		// if(age=16)

		// Works, condition true
		if (age == 16) {
			System.out.println("Assignment used");
		}

		// Works, condition true
		// if(false)

		// Works, condition true
		if (!false) {
			System.out.println("Not false");
		}
	}
}
