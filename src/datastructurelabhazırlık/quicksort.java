package datastructurelabhazırlık;

public class quicksort {

	void quicksort(int arr[], int beginindex, int endindex) {
		if (beginindex >= endindex) {
			return;

		}
		int pivot = arr[endindex];
		int j = beginindex - 1;
		for (int i = beginindex; i < endindex; i++) {
			if (arr[i] < pivot) {
				j++;
				swap(arr, i, j);

			}
		}
		j++;
		swap(arr, endindex, j);

		quicksort(arr, beginindex, j - 1);
		quicksort(arr, j + 1, endindex);
	}

	private void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
