package org.dev.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("rawtypes")
class Apple1 implements Comparable {

	Integer wt;

	Apple1(int wt) {
		this.wt = wt;
	}

	public String toString() {
		return "Weight= " + wt + " gms";
	}

	@Override
	public int compareTo(Object obj) {
		return this.wt - (((Apple1) obj).wt);
	}

}

public class ComparableApple {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList<Apple1> apple = new ArrayList<Apple1>();
		apple.add(new Apple1(20));
		apple.add(new Apple1(18));
		apple.add(new Apple1(22));
		apple.add(new Apple1(15));
		System.out.println(apple);

		System.out.println("After sorting");
		Collections.sort(apple);
		System.out.println(apple);
	}
}
