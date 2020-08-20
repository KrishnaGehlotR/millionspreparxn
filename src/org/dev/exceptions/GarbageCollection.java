package org.dev.exceptions;

public class GarbageCollection {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		long freeMemoryBefore = rt.freeMemory();
		System.out.println("Free memory in JVM before Garbage collection=" + freeMemoryBefore);

		rt.gc();

		long freeMemoryAfter = rt.freeMemory();
		System.out.println("Free memory in JVM after Garbage collection=" + freeMemoryAfter);
		System.out.println("Memoery released: " + (freeMemoryAfter - freeMemoryBefore));
	}
}
