package org.dev.methodoverriding;

class Animal {

	void speak() {
		System.out.println("Animal speaking");
	}
}

class Mammal extends Animal {

	void speak() {
		System.out.println("Mammal speaking");
	}
}

class Dog extends Mammal {

	void speak() {
		System.out.println("Bow Bow");
	}
}

public class AnimalMammalDog {

	public static void main(String[] args) {

		Mammal m1 = new Mammal();
		m1.speak();

		Animal a1 = new Animal();
		a1.speak();

		Dog d1 = new Dog();
		d1.speak();
	}

}
