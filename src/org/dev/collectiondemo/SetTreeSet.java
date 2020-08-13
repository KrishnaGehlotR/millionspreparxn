package org.dev.collectiondemo;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeSet {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		System.out.println("Add element to TreeSet");
		ts.add("India");
		ts.add("Australia");
		ts.add("South Africa");
		ts.add("USA");
		ts.add("UK");
		ts.add("Russia");
		ts.add("Cannada");
		System.out.println("TreeSet=" + ts);
		System.out.println();

		System.out.println("Remove element to TreeSet");
		ts.remove("Australia");
		System.out.println("TreeSet=" + ts);
		System.out.println();

		System.out.println("Iterate element of TreeSet");
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		System.out.println();

		System.out.println("Iterate element of TreeSet in reverse");
		Iterator<String> dItr = ts.descendingIterator();
		while (dItr.hasNext())
			System.out.println(dItr.next());

	}
}
