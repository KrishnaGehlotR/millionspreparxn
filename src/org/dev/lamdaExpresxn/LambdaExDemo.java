package org.dev.lamdaExpresxn;

@FunctionalInterface
interface Drawable {

	public void draw();
}

public class LambdaExDemo {

	public static void main(String[] args) {

		int width = 10;

		// Without lambda, Drawable implementation using anonymous class

		Drawable d1 = new Drawable() {

			@Override
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};

		d1.draw();

		Drawable d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();
	}
}
