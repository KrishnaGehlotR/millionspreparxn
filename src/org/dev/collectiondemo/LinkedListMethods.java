package org.dev.collectiondemo;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Welcome");
		ll.add("Java");
		ll.add(1, "To");
		System.out.println("add() => " + ll);

		ll.set(1, "For");

		System.out.println("set(For) => " + ll);
		System.out.println("clone() => " + ll.clone());
		System.out.println("element() => " + ll.element());
		System.out.println("indexOf(Java) => " + ll.indexOf("Java"));
		System.out.println("offer(Programming) => " + ll.offer("Programming") + " => " + ll);
		System.out.println("offerFirst(Hello) => " + ll.offerFirst("Hello") + " => " + ll);
		System.out.println("offerLast(Practice) => " + ll.offerLast("Practice") + " => " + ll);
		System.out.println("peek() => " + ll.peek() + " => " + ll);
		System.out.println("peekFirst() => " + ll.peekFirst() + " => " + ll);
		System.out.println("peekLast() => " + ll.peekLast() + " => " + ll);
		System.out.println("poll() => " + ll.poll() + " => " + ll);
		System.out.println("pollFirst() => " + ll.pollFirst() + " => " + ll);
		System.out.println("pollLast() => " + ll.pollLast() + " => " + ll);
		System.out.println("pop() => " + ll.pop() + " => " + ll);
		ll.push("Namaskar");
		System.out.println("push(Namaskar) => " + ll);

	}
}
