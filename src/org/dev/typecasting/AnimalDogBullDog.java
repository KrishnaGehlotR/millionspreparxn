package org.dev.typecasting;

class Animal2 {

	void speak() {
		System.out.println("Animal2 speak");
	}
}

class Dog2 extends Animal2 {

	void speak() {
		System.out.println("Dog2 speak");
	}

	void wagTail() {
		System.out.println("Dog2 wag tail");
	}
}

class BullDog2 extends Dog2 {

	void speak() {
		System.out.println("BullDog2 speak");
	}

	void run() {
		System.out.println("BullDog2 run");
	}
}

public class AnimalDogBullDog {

	public static void main(String[] args) {

		Animal2 a1 = new Dog2();// Upcasting
		Dog2 d2 = (Dog2) a1;// Scenario
		d2.speak();
		d2.wagTail();
//		BullDog2 bd2 = (BullDog2) a1;// Class Cast Exception
		System.out.println("-------------------------");

		Animal2 a2 = new BullDog2();// Upcasting
		BullDog2 bd2 = (BullDog2) a2;// Scenario1
		bd2.speak();
		bd2.wagTail();
		bd2.run();
		System.out.println("-------------------------");

		Dog2 d3 = (Dog2) a2;
		d3.speak();
		d3.wagTail();
	}
}
