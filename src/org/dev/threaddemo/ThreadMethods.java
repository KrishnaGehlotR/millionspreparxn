package org.dev.threaddemo;

public class ThreadMethods {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread();
		System.out.println("Name: " + t1.getName());
		System.out.println("Id: " + t1.getId());
		System.out.println("Priority: " + t1.getPriority());

		t1.setName("Initiator");
		t1.setPriority(10);
		System.out.println("Name: " + t1.getName());
		System.out.println("Id: " + t1.getId());
		System.out.println("Priority: " + t1.getPriority());
	}
}
