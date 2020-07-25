package org.dev.controlstatements;

public class ForEachDemo {

	public static void main(String[] args) {

		int marks[] = { 70, 90, 60, 30, 75 };

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("--------------------");

		float tempratures[] = { 28.7f, 32.1f, 21.6f, 22.4f };
		for (int i = 0; i < tempratures.length; i++) {
			System.out.println(tempratures[i]);
		}
		System.out.println("--------------------");

		String[] names = { "Dinga", "Manga", "Pinki", "Monkey" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("--------------------");

		Orange o1 = new Orange();
		Orange[] oranges = { o1, new Orange(), new Orange(), new Orange(), o1 };
		for (int i = 0; i < oranges.length; i++) {
			System.out.println(oranges[i]);
		}
		System.out.println();

		System.out.println("==== Enhanced For Loop ====");

		for (int mark : marks) {
			System.out.println(mark);
		}
		System.out.println("----------------");

		for (float temp : tempratures) {
			System.out.println(temp);
		}
		System.out.println("----------------");

		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("----------------");

		for (Orange orange : oranges) {
			System.out.println(orange);
		}
	}
}

class Orange {

}
