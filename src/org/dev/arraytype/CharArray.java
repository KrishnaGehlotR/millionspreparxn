package org.dev.arraytype;

/**
 * Program to print char and its numeric equivalent
 * 
 * @author krishna
 *
 */
public class CharArray {

	public static void main(String[] args) {

		int arr1[] = { 10, 'a', 'v', 4, 6, 7, '8', 6, 'z' };

		for (int i : arr1) {
			if ((i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
				System.out.println((char) i + "=" + i);
			}
		}
	}
}
