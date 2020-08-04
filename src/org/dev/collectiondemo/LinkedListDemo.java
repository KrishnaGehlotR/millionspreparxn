package org.dev.collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		LinkedList lst1 = new LinkedList();
		lst1.add(100);
		lst1.add("Java");
		lst1.add(12.45);
		lst1.add(true);
		System.out.println("=========> Print LinkedList");
		System.out.println(lst1);

		System.out.println("=========> getFirst() method");
		System.out.println(lst1.getFirst());
		System.out.println(lst1.get(0));

		System.out.println("=========> getLast() method");
		System.out.println(lst1.getLast());
		System.out.println(lst1.get(lst1.size() - 1));

		System.out.println("=========> addFirst() method");
		System.out.println(lst1);
		lst1.addFirst("Hello");
		System.out.println(lst1);

		System.out.println("=========> addLast() method");
		System.out.println(lst1);
		lst1.addLast("Bangalore");
		System.out.println(lst1);

		System.out.println("=========> Forward iterate using ListIterator");
		ListIterator lstItr = lst1.listIterator();
		while (lstItr.hasNext())
			System.out.println(lstItr.next());

		System.out.println("=========> Backward iterate using ListIterator");
		while (lstItr.hasPrevious())
			System.out.println(lstItr.previous());

		LinkedList<String> lst2 = new LinkedList<String>();
		lst2.add("Ravi");
		lst2.add("Vijay");
		lst2.add("Ajay");
		lst2.add("Anuj");
		lst2.add("Gaurav");
		lst2.add("Harsh");
		lst2.add("Virat");
		lst2.add("Gaurav");
		lst2.add("Harsh");
		lst2.add("Amit");

		System.out.println("=========> Remove specific element from list");
		System.out.println(lst2);
		lst2.remove("Vijay");
		System.out.println(lst2);

		System.out.println("=========> Remove element on the basis of specific position");
		System.out.println(lst2);
		lst2.remove(0);
		System.out.println(lst2);

		LinkedList lst3 = new LinkedList();
		lst3.add("Ravi");
		lst3.add("Hanumat");

		System.out.println("=========> Add new elements to list");
		System.out.println(lst2);
		lst2.addAll(lst3);
		System.out.println(lst2);

		System.out.println("=========> Remove all elements from list");
		System.out.println(lst2);
		lst2.removeAll(lst3);
		System.out.println(lst2);

		System.out.println("=========> Remove first element from the list");
		System.out.println(lst2);
		lst2.removeFirst();
		System.out.println(lst2);

		System.out.println("=========> Remove last element from the list");
		System.out.println(lst2);
		lst2.removeLast();
		System.out.println(lst2);

		System.out.println("=========> Remove first occurrence of element from the list");
		System.out.println(lst2);
		lst2.removeFirstOccurrence("Gaurav");
		System.out.println(lst2);

		System.out.println("=========> Remove last occurrence of element from the list");
		System.out.println(lst2);
		lst2.removeLastOccurrence("Harsh");
		System.out.println(lst2);

		System.out.println("=========> Remove all element from the list");
		System.out.println(lst2);
		lst2.clear();
		System.out.println(lst2);

		System.out.println("=========> Traverse the list of elements in reverse order");
		System.out.println(lst1);
		Iterator descItr = lst1.descendingIterator();
		while (descItr.hasNext())
			System.out.println(descItr.next());

	}
}
