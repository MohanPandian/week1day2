package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
	
		// Here is the input
		int[] MissEle = {1,2,3,4,7,6,8};
		
		// Sort the array
		Arrays.sort(MissEle);
		
		// loop through the array (start i from arr[0] till the length of the array)
				for (int i = 0; i < MissEle.length; i++) {
					
		// check if the iterator variable is not equal to the array values respectively
			if (MissEle[i]!=i+1) {
				int j=i+1;
				
		// print the number
				System.out.println("MISSING VALUE is " + j);
				
		// once printed break the iteration	
				break;
				
			}
		}
		

	}

}
