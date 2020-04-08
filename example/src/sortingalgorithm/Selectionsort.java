package sortingalgorithm;

public class Selectionsort {

	public static void main(String[] args) {

		int arr[] = { 40, 10, 50, 20, 60, 30 };
		System.out.print("the unsorted array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {

					min = j;
				}
			}

			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;

			}
		}
		System.out.println();
		System.out.print("the sorted array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
