package org.dev.typecasting;

class Animal {

	void eat() {
		System.out.println("Eating");
	}

	void sleep() {
		System.out.println("Sleeping");
	}
}

class Dog extends Animal {

	void bark() {
		System.out.println("Bow Bow");
	}

	void wagTail() {
		System.out.println("Waging tail");
	}
}

public class DerivedTypeCasting {

	public static void main(String[] args) {

		// Normal creation of object
		System.out.println("=====Normal creation of object");
		Dog dog = new Dog();
		dog.sleep();
		dog.eat();
		dog.bark();
		dog.wagTail();// Can access its own methods and inherited methods

		// Upcasting
		System.out.println("=====Upcasting");
		Animal animal = new Dog();
		animal.sleep();
		animal.eat();
		// animal.bark();
		// animal.WagTail();

		// Downcasting
		System.out.println("=====Downcasting");
		Animal a1 = new Dog();
		a1.eat();
		a1.sleep();

		// Dog d1 = new Animal();// Direct down casting is not possible

		// Explicit down casting, compiler will compile but JVM throws Class Cast
		// Exception
		// Dog d1 = (Dog) new Animal();

		// Upcasted object being down casted
		System.out.println("=====Upcasted object being down casted");
		Dog d1 = (Dog) a1;
		d1.eat();
		d1.sleep();
		d1.bark();
		d1.wagTail();
	}
}
