package sortingalgorithm;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = { 40, 10, 50, 20, 60, 30 };
		System.out.print("the unsorted array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
			
		}
		System.out.println();
		System.out.print("  the sorted array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

	}

}
}
