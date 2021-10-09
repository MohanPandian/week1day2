package week1.day2;

public class Charocc {

	public static void main(String[] args) {
		
		// declare and initialize a variable count to store the number of occurrences
		int count=0;
		String str="welcome to chennai";
		char[] charArray = str.toCharArray();
		
		// Check number of occurrences of a char (eg 'e') in a String
		for (int i = 0; i < charArray.length; i++) {
			
			// traverse from 0 till the array length 
			// Check the char array has the particular char in it 
			
			
			if (charArray[i]=='e') {
				
				// if is has increment the count
				count++;				
			}
				}
		
		// print the count out of the loop
		System.out.println(count);
	}

}
