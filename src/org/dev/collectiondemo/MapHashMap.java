package org.dev.collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapHashMap {

	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Vishal", 10);
		hm.put("Sachin", 20);
		hm.put("Vaibhav", 30);

		for (Map.Entry<String, Integer> es : hm.entrySet()) {
			System.out.println(es.getKey() + " " + es.getValue());
		}
	}
}
