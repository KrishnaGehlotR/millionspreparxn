package org.dev.collectiondemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashSet {

	public static void main(String[] args) {

		Set<String> lhs = new LinkedHashSet<String>();
		lhs.add("India");
		lhs.add("Australia");
		lhs.add("South Africa");
		lhs.add("USA");
		lhs.add("UK");
		lhs.add("Russia");
		lhs.add("Cannada");
		System.out.println("lhs=" + lhs);

		lhs.add("India");
		System.out.println("lhs=" + lhs);

		lhs.remove("Australia");
		System.out.println("lhs=" + lhs);

		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}
}
