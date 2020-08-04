package org.dev.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		ArrayList lst = new ArrayList();
		lst.add(10);
		lst.add(25);
		lst.add(15);
		lst.add((int) 12.55);
		System.out.println("Before Sorting");
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println("After Sorting");
		System.out.println(lst);

		lst.clear();
		lst.add("Krishna");
		lst.add("Rahul");
		lst.add("Chinthan");
		lst.add("Rajashekar");
		lst.add("Suresh");
		System.out.println("Before Sorting");
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println("After Sorting");
		System.out.println(lst);

		Collections.shuffle(lst);
		System.out.println("After Shuffle");
		System.out.println(lst);
	}
}
