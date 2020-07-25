package org.dev.typecasting;

class Fruit {

	void test() {
		System.out.println("test() of class Fruit");
	}
}

class Apple extends Fruit {

	void test() {
		System.out.println("test() of class Apple");
	}
}

class OotyApple extends Apple {

	void test() {
		System.out.println("test() of class OotyApple");
	}
}

class Execuion {

	static void start(Fruit f) {
		if (f instanceof Fruit) {
			f.test();
		} else {
			System.out.println("Null value passed");
		}
	}
}

public class FruitExecution {

	public static void main(String[] args) {

		Fruit f1 = new Fruit();
		Execuion.start(f1);
		Execuion.start(new Fruit());
		Execuion.start(null);
		// Generate NullPointerException it can be handled using instanceof operator

		Apple a1 = new Apple();
		Execuion.start(a1);
		Execuion.start(new Apple());
		Execuion.start(null);

		OotyApple a2 = new OotyApple();
		Execuion.start(a2);
		Execuion.start(new OotyApple());
		Execuion.start(null);
	}
}
