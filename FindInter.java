package week1.day2;

public class FindInter {

	public static void main(String[] args) {

		

	// a) Declare An array for {3,2,11,4,6,7};	 
	// b) Declare another array for {1,2,8,4,9,7};
		
		int[] inter = { 3, 2, 11, 4, 6, 7 };
		int[] inter1 = { 1, 2, 8, 4, 9, 7 };

	//c) Declare for loop iterator from 0 to array length
		for (int i = 0; i < inter.length; i++) {

	//d) Declare a nested for another array from 0 to array length
			for (int j = 0; j < inter1.length; j++) {
			
	//e) Compare Both the arrays using a condition statement
				if (inter[i] == inter1[j]) {
					
	//f) Print the first array (should match item in both arrays)
					System.out.println("Missing Element " + inter[i]);
				}
			}
		}

	}

}
