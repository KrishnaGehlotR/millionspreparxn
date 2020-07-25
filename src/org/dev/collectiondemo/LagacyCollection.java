package org.dev.collectiondemo;

import java.util.Hashtable;
import java.util.Vector;

public class LagacyCollection {

	public static void main(String[] args) {

		// Creating instance of Array
		int arr[] = new int[] { 1, 0 };

		// Array elements are accessed using []
		System.out.println(arr[0]);

		// Creating instance of Vector
		Vector<Integer> vector = new Vector<Integer>();

		// Vector element insertion require addElement()
		vector.addElement(2);
		vector.addElement(3);

		// Vector elements using elementAt()
		System.out.println(vector.elementAt(0));

		// Creating instance of Hashtable
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();

		// Hashtable element insertion require put()
		hashtable.put(1, "Krishna");
		hashtable.put(2, "Dev");

		// Hashtable elements using get()
		System.out.println(hashtable.get(1));
	}
}
