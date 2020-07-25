package org.dev.methods;

public class SumMethod {

	static public void main(String[] args) {
		int sum = getSum(50, 30);
		System.out.println(sum);
	}

	static public int getSum(int num1, int num2) {
		int total = num1 + num2;
		return total;
	}
}
