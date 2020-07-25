package org.dev.variables;

public class StaticVariable {

	static int i = 12;// Declaration of static variable
	static int j;
	// j=20; static variable cannot be initialized in different line
	// Initialization should be in the same line if not initialized then it will take
	// default value

	public static void main(String[] args) {
		
		System.out.println(i);
		System.out.println(j);
	}
}
