package onedim_array;

import java.util.Arrays;

public class OneSinglearray {
	int arr[] = null;

	public OneSinglearray(int sizeofArray) {
		arr = new int[sizeofArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}

	}

	// method to print the default size of the array
	@Override
	public String toString() {
		return "OneSinglearray [arr=" + Arrays.toString(arr) + "]";
	}

	public void traversearray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + " ");
			}
		}

		catch (Exception e) {
			System.out.println("Array no longer exists!");

		}
	}

	public void insert(int location, int valuetobeadded) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = valuetobeadded;

				System.out.println("successfullyadded" + valuetobeadded + "in location:" + location);
			}

			else
				System.out.println("the location is already occupied");
		} catch (Exception e) {
			System.out.println("invalied index to acess the array");
		}

	}

	// Access a particular element of an array
	public void accessing(int cellnumber) {
		try {
			System.out.println(arr[cellnumber]);

		} catch (Exception e) {

			System.out.println("Arrayindex out of bound exception ");
		}

	}

	public void search_an_array(int valuetobesearched) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valuetobesearched) {
				System.out.println("value is present   " + arr[i]);
				return;
			}
		}

		System.out.println(valuetobesearched + " " + "value is not present ");

	}

	public void delete(int location, int valuetobedeleted) {
		try {
			if (arr[location] == valuetobedeleted) {
				arr[location] = Integer.MIN_VALUE;

				System.out.println("successfullydeleted" + valuetobedeleted + "in location:" + location);
			} else
				System.out.println("the location is MIN VALUE");
		} catch (Exception e) {
			System.out.println("invalied index to acess the array");
		}

	}

}
