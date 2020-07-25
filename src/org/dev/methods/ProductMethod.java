package org.dev.methods;

public class ProductMethod {

	public static void main(String[] args) {
		int product = getProduct(2500, 12);
		System.out.println(product);
	}

	public static int getProduct(int num1, int num2) {
		int prod = num1 * num2;
		return prod;
	}
}
