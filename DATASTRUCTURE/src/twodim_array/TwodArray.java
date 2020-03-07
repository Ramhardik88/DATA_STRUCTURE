package twodim_array;

public class TwodArray {

	public static void main(String[] args) {

		TwoDoublearray tda = new TwoDoublearray(3, 3);

		tda.traversearray();
		tda.insert(0, 0, 3);
		tda.insert(2, 2, 3);
		tda.traversearray();
		tda.accessSingleCell(0, 2);
		tda.accessSingleCell(3, 2);
		tda.accessSingleCell(1, 2);

		tda.searchingSingleValue(10);
		tda.searchingSingleValue(-2147483648);
		tda.searchingSingleValue(1000000001);

		tda.deleteValuefromArray(0, 2);
		tda.traversearray();

		

	}

}
