package week1.day2;

public class PrintDuplicate {

	public static void main(String[] args) {

		int[] Dup = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// get the length of the array
		// declare an int variable named count
		int length = Dup.length;
		System.out.println("The size of the length " + length);

		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i < Dup.length; i++) {
			

			// assign 0 to count 
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for (int count = i + 1; count < Dup.length; count++) {
				
			// compare both the loop variables & check they're equal
				if (Dup[i] == Dup[count]) {
					
			// increase the count if both the arrays are equal
					System.out.println("DUPLICATE ELEMENT " + Dup[i]);
				}

			}
		}

	}

}
