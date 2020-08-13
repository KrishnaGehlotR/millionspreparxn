package org.dev.collectiondemo;

import java.util.Hashtable;

public class MapHashTable {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();

		ht.put(3, "Geeks");
		ht.put(2, "ForGeeks");
		ht.put(1, "is Best");

		ht1 = (Hashtable<Integer, String>) ht.clone();
		System.out.println("Values in clone " + ht1);

		ht.clear();
		System.out.println("Afer clearing " + ht);

	}
}
