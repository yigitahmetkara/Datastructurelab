package datastructurelabhazırlık;

public class bubblesort {

	static void bubblesort(int arr[], int n) {
		int i, temp, j;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;

				}
				if (swapped == false) {
					break;
				}

			}
		}
	}

	static void printarray(int arr[], int size) {
		int i;
		for (int i1 = 0; i1 < size; i1++) {
			System.out.print(arr[i1] + " ");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 62, 35, 46, 89, 76, 65, 43 };
		int n = arr.length;

	}

}
