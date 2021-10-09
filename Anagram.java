package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
		/*Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; */
		
		String text1 = "stops";		 
		String text2 = "posts";
		
		// * a) Check length of the strings are same then (Use A Condition)
		if (text1.length()!=text2.length()) {
			
			System.out.println("text canot be anagram because both are same");
		}
		else
		{
			// * b) Convert both Strings in to characters
			char[] charArray1=text1.toCharArray();
			char[] charArray2=text2.toCharArray();
			
			// * c) Sort Both the arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			//* d) Check both the arrays has same value
			boolean equals = Arrays.equals(charArray1, charArray2);
			if (equals==true) {
				
				System.out.println("text is anagram");				
			}
			
		}

	}

}
