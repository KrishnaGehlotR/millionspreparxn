package org.dev.collectiondemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueMethods {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();
		pq.add("Arun");
		pq.add("Venkatesh");
		pq.add("Karthika");
		pq.add("Pranab");
		System.out.println("PriorityQueue => " + pq);
		System.out.println("element() => " + pq.element() + " => " + pq);
		System.out.println("peek() => " + pq.peek() + " => " + pq);

		Iterator itr = pq.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("poll() => " + pq.poll() + " => " + pq);

		PriorityQueue<Integer> intPq = new PriorityQueue<Integer>();
		int arr[] = { 50, 30, 100, 25, 78 };

		for (int a : arr)
			intPq.add(a);
		System.out.println(intPq);

		for (Object o : intPq)
			System.out.println(o);
		System.out.println(intPq);

		for (int i = 0; i < intPq.size(); i++)
			System.out.println(intPq.poll());

		System.out.println(intPq);
		System.out.println(intPq.poll());
		System.out.println(intPq.size());
		System.out.println(intPq.remove());

	}
}
