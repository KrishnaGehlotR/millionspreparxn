package org.dev.collectiondemo;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class AbsractCollectionDemo {

	public static void main(String[] args) {

		AbstractCollection<Object> ac = new ArrayList<Object>();
		ac.add("Welcome");
		ac.add("To");
		ac.add("India");

		System.out.println("Abstract Collections: " + ac);
	}
}
