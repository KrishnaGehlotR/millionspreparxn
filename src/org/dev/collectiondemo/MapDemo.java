package org.dev.collectiondemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		Map hm = new HashMap();
		hm.put("ind", "India");
		hm.put("nz", "NewZealand");
		hm.put("uk", "United Kingdom");

		System.out.println("======= Print the size =======");
		System.out.println("size=" + hm.size());
		System.out.println();

		System.out.println("======= Print key and value =======");
		System.out.println("hm=" + hm);
		System.out.println();

		System.out.println("======= containsKey() method =======");
		if (hm.containsKey("ind"))
			System.out.println(hm.get("ind"));
		System.out.println();

		System.out.println("======= containsValue() method =======");

		System.out.println(hm.containsValue("Japan"));
		System.out.println();

		System.out.println("======= Print only keys =======");
		System.out.println(hm.keySet());
		System.out.println();

		System.out.println("======= Print only values =======");
		System.out.println(hm.values());
		System.out.println();

		System.out.println("======= Iterate map using iterator =======");
		Set ks = hm.keySet();
		Iterator itr1 = ks.iterator();
		while (itr1.hasNext())
			System.out.println(hm.get(itr1.next()));
		System.out.println();

		System.out.println("======= Iterate map using foreach loop =======");
		for (Object obj : ks)
			System.out.println(obj);
		System.out.println();

		System.out.println("======= Iterate map entrySet() =======");
		Set es = hm.entrySet();
		Iterator itr2 = es.iterator();
		while (itr2.hasNext()) {
			Map.Entry me = (Map.Entry) itr2.next();
			System.out.println("Key is: " + me.getKey());
			System.out.println("Value is: " + me.getValue());
		}
		System.out.println();

		System.out.println(hm.values());
		System.out.println();

		for (Object obj : hm.values())
			System.out.println(obj);
		System.out.println();

		System.out.println("===== Collection");
		Collection<String> colxn = hm.values();
		Iterator<String> itr = colxn.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		System.out.println();

		System.out.println(hm.values());
	}
}
