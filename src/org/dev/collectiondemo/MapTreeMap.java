package org.dev.collectiondemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class MapTreeMap {

	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("vishal", 10);
		tm.put("sachin", 30);
		tm.put("vaibhav", 20);
		System.out.println(tm);

		SortedMap<String, Integer> subMap = tm.subMap("sachin", "vishal");
		System.out.println("subMap: " + subMap);

		SortedMap<String, Integer> headMap = tm.headMap("vishal");
		System.out.println("headMap: " + headMap);

		SortedMap<String, Integer> tailMap = tm.tailMap("sachin");
		System.out.println("tailMap: " + tailMap);

		System.out.println("firstKey: " + tm.firstKey());
		System.out.println("lastKey: " + tm.lastKey());
	}
}
