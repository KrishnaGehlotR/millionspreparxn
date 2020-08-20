package org.dev.exceptions;

public class FinalizeMethod {

	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Memory Cleaning");
	}

	public static void main(String[] args) throws Throwable {
		FinalizeMethod fm = new FinalizeMethod();
		fm.finalize();
	}
}
