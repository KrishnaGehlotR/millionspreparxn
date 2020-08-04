package org.dev.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

interface Fruit {

}

class Orange implements Fruit {

}

public class ArrayListMethods {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		List lst1 = new ArrayList();
		System.out.println("============> isEmpty() method");
		System.out.println("isEmpty(): " + lst1.isEmpty());

		System.out.println("============> add() method");
		lst1.add(10);
		lst1.add(true);
		lst1.add("Hello");
		lst1.add(new String("Bangalore"));
		lst1.add(new Orange());
		System.out.println("isEmpty(): " + lst1.isEmpty());

		Orange o1 = new Orange();
		lst1.add(o1);

		// Number of elements (objects)
		System.out.println("============> size() method");
		System.out.println("Size: " + lst1.size());

		System.out.println("============> contains() method");
		System.out.println(lst1.contains(true));
		System.out.println(lst1.contains("Hello"));
		System.out.println(lst1.contains("Bangalore"));
		System.out.println(lst1.contains(new Orange()));
		System.out.println(lst1.contains(o1));

		System.out.println("============> get() method");
		System.out.println(lst1.get(3));
		System.out.println(lst1.get(4));

		String s1 = null;
		if (lst1.get(2) instanceof String) {
			s1 = (String) lst1.get(2);
			System.out.println(s1.length());
		}

		System.out.println("============> get all objects and print");
		for (int i = 0; i < lst1.size(); i++) {
			System.out.println(lst1.get(i));
		}

		System.out.println("============> Enhanced for loop");
		for (Object obj : lst1) {
			System.out.println(obj);
		}

		// To add objects of same type
		ArrayList<Integer> lst2 = new ArrayList<>();// Works in 1.7
		lst2.add(1925);

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(1562);

		ArrayList<Orange> lst4 = new ArrayList<Orange>();
		lst4.add(new Orange());

		ArrayList<String> lst5 = new ArrayList<String>();
		lst5.add("Rajesh");
		lst5.add("Linga");
		lst5.add("Malinga");

		ArrayList<Fruit> lst6 = new ArrayList<Fruit>();
		lst6.add(new Orange());// Objects of fruit interface

		// Objects of class implementing fruit interface
		System.out.println("============> Get all string objects and print using enhanced for loop");
		for (String str : lst5)
			System.out.println(str);

		System.out.println("============> Converting to array object & printing objects");
		Object[] objs = lst5.toArray();
		for (Object obj : objs)
			System.out.println(obj);

		System.out.println("============> Using Iterator");
		Iterator<String> itr = lst5.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("============> Using List Iterator next()");
		ListIterator<String> lstItr = lst5.listIterator();
		while (lstItr.hasNext())
			System.out.println(lstItr.next());

		System.out.println("============> Using List Iterator previous()");
		while (lstItr.hasPrevious())
			System.out.println(lstItr.previous());

		ArrayList lst7 = new ArrayList();
		lst7.add("Java");
		lst7.add(100);
		lst7.add(1, true);
		lst7.add(o1);
		System.out.println(lst7);

		System.out.println("============> addAll() method");
		lst7.addAll(lst5);
		System.out.println(lst7);

		System.out.println("============> remove() method");
		lst7.remove(1);// Remove at index
		System.out.println(lst7);
		lst7.remove(Integer.valueOf(100));// Wrap it to remove a primitive value
		System.out.println(lst7);
		lst7.remove(o1);// Remove an object using reference variable
		System.out.println(lst7);

		System.out.println("============> removeAll() method");
		lst7.removeAll(lst5);// RemoveAll() removes items in the given list
		System.out.println(lst7);

		System.out.println("============> addAll() method");
		lst7.addAll(lst5);
		System.out.println(lst7);

		System.out.println("============> retainAll() method");
		lst7.retainAll(lst5);// RetainAll() retains items in the list and removes the rest
		System.out.println(lst7);

		System.out.println("============> clear() method");
		lst7.clear();// Clear the list
		System.out.println(lst7);
		System.out.println("isEmpty(): " + lst1.isEmpty());
	}
}
