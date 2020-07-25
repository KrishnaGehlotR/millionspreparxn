package org.dev.typecasting;

class Animal1 {

	void speak() {
		System.out.println("Animal speak");
	}
}

class Mammal1 extends Animal1 {

	void speak() {
		System.out.println("Mammal speak");
	}
}

class Monkey1 extends Mammal1 {

	void speak() {
		System.out.println("Monkey speak");
	}
}

public class AnimalMammalMonkey {

	public static void main(String[] args) {

		System.out.println("==== Upcasting ====");
		Animal1 a1 = new Mammal1();
		a1.speak();
		Mammal1 m1 = new Monkey1();
		m1.speak();
		Animal1 a2 = new Monkey1();
		a2.speak();
//		System.out.println(a1);
//		System.out.println(m1);
//		System.out.println(a2);

		System.out.println("==== Down casting ====");
		Mammal1 m2 = (Mammal1) a1;
		m2.speak();
		Monkey1 m3 = (Monkey1) a2;
		m3.speak();
		Monkey1 m4 = (Monkey1) m1;
		m4.speak();
		Mammal1 m5 = (Mammal1) a2;
		m5.speak();
//		System.out.println(m2);
//		System.out.println(m3);
//		System.out.println(m4);
//		System.out.println(m5);
	}
}
