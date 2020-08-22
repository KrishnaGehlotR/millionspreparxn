package org.dev.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class WaterBottle {

	Integer wt, ht;

	public WaterBottle(int wt, int ht) {
		this.wt = wt;
		this.ht = ht;
	}

	public String toString() {
		return "Wt=" + wt + " Ht=" + ht;
	}
}

@SuppressWarnings("rawtypes")
class SortByWt implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		return ((WaterBottle) obj1).wt - ((WaterBottle) obj2).wt;
	}

}

@SuppressWarnings("rawtypes")
class SortByHt implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		return ((WaterBottle) obj1).ht - ((WaterBottle) obj2).ht;
	}

}

public class ComparatorWaterBottle {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList lst = new ArrayList();
		lst.add(new WaterBottle(15, 30));
		lst.add(new WaterBottle(19, 32));
		lst.add(new WaterBottle(14, 28));
		lst.add(new WaterBottle(21, 33));
		lst.add(new WaterBottle(12, 29));

		System.out.println("Printing Elements");
		System.out.println(lst);
		System.out.println();

		Collections.sort(lst, new SortByWt());

		System.out.println("Printing elements sorted by weight");
		System.out.println(lst);
		System.out.println();

		Collections.sort(lst, new SortByHt());

		System.out.println("Printing elements sorted by height");
		System.out.println(lst);
	}
}
