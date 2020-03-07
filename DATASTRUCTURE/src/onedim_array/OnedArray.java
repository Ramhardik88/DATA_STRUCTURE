package onedim_array;

public class OnedArray {

	public static void main(String[] args) {
		System.out.println("Creating a blank array with size is 5");
		OneSinglearray osa = new OneSinglearray(5);
		System.out.println(osa.toString());

		System.out.println("printing the array");

		osa.traversearray();
		System.out.println();
		System.out.println();

		System.out.println("Inserting the few elements");
		osa.insert(0, 23);
		osa.insert(1, 45);
		osa.insert(2, 12);
		osa.insert(3, 34);
		osa.insert(4, 88);
		osa.insert(7, 89);
		osa.insert(1, 38);
		System.out.println();
		System.out.println();

		osa.accessing(3);
		osa.accessing(109);
		System.out.println();
		System.out.println();

		osa.search_an_array(23);
		osa.search_an_array(123);
		System.out.println();
		System.out.println();

		System.out.println(" the value to be deleted");
		osa.delete(0, 23);
		
		System.out.println();
		System.out.println();
	}

}
