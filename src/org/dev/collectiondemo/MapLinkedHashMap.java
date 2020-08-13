package org.dev.collectiondemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinkedHashMap {

	public static void main(String[] args) {

		Map<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("vishal", 10);
		lhm.put("sachin", 30);
		lhm.put("vaibhav", 20);
		System.out.println(lhm);
	}
}
