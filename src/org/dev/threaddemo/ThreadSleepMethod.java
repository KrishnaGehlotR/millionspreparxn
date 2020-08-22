package org.dev.threaddemo;

public class ThreadSleepMethod {

	public static void main(String[] args) {

		System.out.println("Main Starts");
	
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Ends");
	}
}
