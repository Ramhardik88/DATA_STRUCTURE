package sortingalgorithm;

import java.util.Scanner;

public class BubblesortMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();
		}

		System.out.println("to print the un sorted array");
		for (int k : arr) {
			System.out.print(k + " ");
		}

		Bubblesort sort = new Bubblesort();
		sort.bubble(arr);
		sort.printsort(arr);

	}

}
