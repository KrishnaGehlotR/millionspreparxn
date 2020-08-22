package org.dev.lamdaExpresxn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaExpComparator {

	public static void main(String[] args) {

		List<Product> arrLst = new ArrayList<Product>();

		// Adding Products
		arrLst.add(new Product(1, "HP Laptop", 25000f));
		arrLst.add(new Product(3, "Keyboard", 300f));
		arrLst.add(new Product(2, "Dell Mouse", 150f));

		System.out.println("Sorting on the basis of name");

		// Implementing lambda expression
		Collections.sort(arrLst, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		for (Product p : arrLst)
			System.out.println(p.id + " " + p.name + " " + p.price);
	}
}
