package org.dev.collectiondemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		Set hs = new HashSet();

		System.out.println("hs=" + hs);

		hs.add(10);
		hs.add(12.45);
		hs.add("Hello");
		hs.add(10);
		hs.add("Tree");
		System.out.println(hs);

		Iterator itr = hs.iterator();
		System.out.println("======= First time =======");

		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("======= Alternate way =======");
		for (Object obj : hs)
			System.out.println(obj);

		Set<Integer> hs1 = new HashSet<Integer>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		hs1.add(50);
		System.out.println(hs1);

		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(20);
		hs2.add(40);
		hs1.addAll(hs2);// Add non duplicate objects
		hs1.retainAll(hs2);// Retains in hs1 what is present in hs2 add also hs1 & removes all others
		System.out.println(hs1);
	}
}
