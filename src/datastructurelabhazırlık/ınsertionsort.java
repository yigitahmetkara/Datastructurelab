package datastructurelabhazırlık;

public class ınsertionsort {

	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int number = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > number) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = number;
		}

	}

	static void printarray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 62, 33, 45, 67, 89, 90 };
		ınsertionsort ob = new ınsertionsort();
		ob.sort(arr);
		printarray(arr);

	}

}
