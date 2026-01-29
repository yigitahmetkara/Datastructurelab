package datastructurelabhazırlık;

public class selectionsort {

	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int minidx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minidx]) {
					minidx = j;
					int temp = arr[minidx];
					arr[minidx] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	void printarray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectionsort ob = new selectionsort();

		int[] arr = { 64, 35, 34, 78, 65 };
		ob.sort(arr);
		System.out.println("sorted array");
		ob.printarray(arr);
	}

}
