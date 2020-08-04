package org.dev.collectiondemo;

import java.util.ArrayList;

class Apple {

	int wt;

	public Apple(int wt) {
		this.wt = wt;
	}

	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Apple)
			if (this.wt == ((Apple) obj).wt)
				return true;
		return false;
	}

	public int hashcode() {
		return 7 * 5 * wt;
	}
}

public class ArrayListDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList lst = new ArrayList();
		lst.add(new Apple(100));

		Apple a1 = new Apple(100);
		lst.add(a1);
		System.out.println(lst);

		lst.remove(new Apple(100));// Removes first Apple object
		System.out.println(lst);

		lst.remove(new Apple(100));// Removes second Apple object
		System.out.println(lst);

		lst.remove(a1);
		System.out.println(lst);
	}
}
