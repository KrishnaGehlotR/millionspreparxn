package org.dev.collectiondemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetHashSet {

	public static void main(String[] args) {

		Set<Integer> aSet = new HashSet<Integer>();
		aSet.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		System.out.println("aSet=" + aSet);

		Set<Integer> bSet = new HashSet<Integer>();
		bSet.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
		System.out.println("bSet=" + bSet);
		System.out.println();

		// To find union
		System.out.println("Union of the two set");
		Set<Integer> union = new HashSet<Integer>(aSet);
		union.addAll(bSet);
		System.out.println("union=" + union);
		System.out.println();

		// To find intersection
		System.out.println("Intersection of the two set");
		Set<Integer> intersection = new HashSet<Integer>(aSet);
		intersection.retainAll(bSet);
		System.out.println("intersection=" + intersection);
		System.out.println();

		// To find the symmetric difference
		System.out.println("Difference of the two set");
		HashSet<Integer> difference = new HashSet<Integer>(aSet);
		difference.removeAll(bSet);
		System.out.println("difference=" + difference);

	}
}
