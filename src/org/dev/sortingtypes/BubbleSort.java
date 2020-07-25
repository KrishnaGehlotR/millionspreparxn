package org.dev.sortingtypes;

public class BubbleSort {

	// Bubble sorting
	void bubbleSort(int arr[]) {
		System.out.println("arr=" + arr);

		int n = arr.length;
		System.out.println("n=" + n);
		System.out.println("n-1=" + (n - 1));

		for (int i = 0; i < n- 1; i++) {
			System.out.println("n-i-1=" + (n - i - 1));

			for (int j = 0; j < n - i - 1; j++) {

				System.out.println("arr[" + j + "] > arr[" + (j = +1) + "]=" + (arr[j] > arr[j + 1]));
				if (arr[j] > arr[j + 1]) {

					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					System.out.println("temp=" + temp);

					arr[j] = arr[j + 1];
					System.out.println("arr[j]=" + arr[j]);

					arr[j + 1] = temp;
					System.out.println("arr[j + 1]" + arr[j + 1]);
				}
			}
		}
	}

	// Print the array
	void printArray(int arr[]) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		BubbleSort bs = new BubbleSort();
		int arr[] = { 5, 1, 4, 2, 8 };
		bs.bubbleSort(arr);
		System.out.println("Sorted array");
		bs.printArray(arr);
	}
}
