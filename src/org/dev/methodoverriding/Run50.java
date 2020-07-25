package org.dev.methodoverriding;

class Animal1 {

	void speak() {
		System.out.println("Animal speaking");
	}

	void disp(String name, int age) {
		System.out.println("Name= " + name + " Age= " + age);
	}

	// Overloading
	void disp(int age, String name) {
		System.out.println("Name= " + name + " Age= " + age);
	}
}

class Mammal1 extends Animal1 {

	void speak() {
		System.out.println("Mammal speaking");
	}
}

class Dog1 extends Mammal1 {

	// Overriding
	void speak() {
		System.out.println("Bow Bow");
	}

	void disp() {
		System.out.println("Scoopy bow bow");
	}
}

public class Run50 {

	public static void main(String[] args) {

		Dog1 d1 = new Dog1();
		d1.speak();

		d1.disp(2, "Scoopy");
		d1.disp("Scrapy", 2);
		d1.disp();
	}
}
