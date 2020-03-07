package twodim_array;

public class TwoDoublearray {
	int arr[][] = null;

	public TwoDoublearray(int sizeofrow, int sizeofcolumn) {
		arr = new int[sizeofrow][sizeofcolumn];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = Integer.MIN_VALUE;
			}
		}
	}

	public void traversearray() {
		System.out.println("printing the array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	public void insert(int row, int column, int valuetobeadded) {
		if (arr[row][column] == Integer.MIN_VALUE) {
			arr[row][column] = valuetobeadded;
			System.out.println("Successfully inserted " + valuetobeadded + " in the array.");
		} else {
			System.out.println("This cell is already occupied by another value.");
		}

	}

	// Accessing single value from given array
	public void accessSingleCell(int row, int col) {
		System.out.println("\nAccessing Row#" + row + ", Col#" + col + "...");
		try {
			System.out.println("Cell value is: " + arr[row][col]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array !");
			// e.printStackTrace();
		}
		System.out.println();
	}
	
	
	// Searching a single value from the Array
	public void searchingSingleValue(int value) {
		System.out.println("\nSearching value " + value + " in the array");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if (arr[row][col] == value) {
					System.out.println("Value is founud at location Row:" + row + " & Col:" + col + "\n\n");
					return;
				}
			}
		}
		System.out.println("Value is not found in Array\n");

	}
	
	
	// Deleting a value from Array
	public void deleteValuefromArray(int deleteValueFromThisRow, int deleteValueFromThisCol) {
		System.out.println(
				"Deleting value from Row#" + deleteValueFromThisRow + " & Col#" + deleteValueFromThisCol + "...");
		try {
			System.out.println("Successfully deleted: " + arr[deleteValueFromThisRow][deleteValueFromThisCol]);
			arr[deleteValueFromThisRow][deleteValueFromThisCol] = Integer.MIN_VALUE;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Cant delete the value as cell# provided is not in the range of array !");
			// e.printStackTrace();
		}
	}
	

	

}
