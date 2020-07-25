package org.dev.controlstatements;

public class IfBlockMultipleStatement {

	public static void main(String[] args) {
		int age;
		age = 16;

		// Only statement next to if gets executed when condition is true and others
		// statement gets executed as usual
		if (age < 18)
			System.out.println("Not eligible to work");
		age = age + 2;
		System.out.println("Age is: " + age);

		if (age < 18) {
			System.out.println("Not eligible to work");
			age = age + 2;
			System.out.println("Age is: " + age);
		}

	}
}
