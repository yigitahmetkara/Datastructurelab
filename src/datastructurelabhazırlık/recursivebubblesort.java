package datastructurelabhazırlık;

import java.util.Arrays;

public class recursivebubblesort {

	static void bubblesort(int arr[], int n) {
		if (n == 1) {
			return;

		}
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				count += 1;

			}
			if (count == 0) {
				return;

			}
			// En büyük eleman sabittir.
			bubblesort(arr, n - 1);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 64, 34, 25, 12, 45, 67 };
		bubblesort(arr, arr.length);
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(arr));

	}

}
