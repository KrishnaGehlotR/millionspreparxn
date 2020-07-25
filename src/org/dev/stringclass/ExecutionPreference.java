package org.dev.stringclass;

public class ExecutionPreference {

	void test(double d) {
		System.out.println("double argument method");
	}

	void test(Integer intObj) {
		System.out.println("Integer argument method");
	}

	void test(Number num) {
		System.out.println("Number argument method");
	}

	void test(Object obj) {
		System.out.println("Object argument method");
	}

	void test(int i) {
		System.out.println("int argument method");
	}

	public static void main(String[] args) {

		ExecutionPreference ep = new ExecutionPreference();
		ep.test(10);
	}
}
