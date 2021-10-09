package week1.day2;

public class ChangeOddIndextoUpperCase {

	public static void main(String[] args) {
		
		
		// * String test = "changeme";
		String str="changeme";
		
		// * a) Convert the String to character array
		char[] charArray=str.toCharArray();
		
		// * b) Traverse through each character (using loop)
		for (int i = 0; i < charArray.length; i++) {
		
		// * c)find the odd index within the loop (use mod operator)
			if (i%2==0) {
			
				//* d)within the loop, change the character to uppercase, if the index is odd else don't change
				char STR1=Character.toUpperCase(charArray[i]);
				System.out.println(STR1);
				
			}else
			{
				System.out.println(charArray[i]);
			}
		}
		

	}

}
