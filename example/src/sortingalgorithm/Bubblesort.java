package sortingalgorithm;

public class Bubblesort {

	public void bubble(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
	}

	public void printsort(int arr[]) {
		System.out.println("the sorted array is");
		for (int s : arr) {
			System.out.print(s + " ");

		}
	}

}
