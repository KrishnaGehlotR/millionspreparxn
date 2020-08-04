package org.dev.collectiondemo;

import java.util.LinkedList;
import java.util.Spliterator;

class Shape {

	String shapeName;
	int area;

	public Shape(String shapeName, int area) {
		super();
		this.shapeName = shapeName;
		this.area = area;
	}
}

public class LinkedListSplitIterator {

	public static void main(String[] args) {

		LinkedList<Shape> shapes = new LinkedList<Shape>();
		shapes.add(new Shape("Circle", 234));
		shapes.add(new Shape("Square", 225));
		shapes.add(new Shape("Cone", 543));
		shapes.add(new Shape("Rectangle", 342));

		Spliterator<Shape> spliterator = shapes.spliterator();
		System.out.println("Result of shapes:");

		spliterator.forEachRemaining((Value) -> printDetails(Value));
	}

	public static void printDetails(Shape shape) {
		System.out.println("******************");
		System.out.println("Shape name : " + shape.shapeName);
		System.out.println("Shape area : " + shape.area);
	}
}
