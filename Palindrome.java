package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		//* a) Declare A String value as"madam"
		String str="monday";
		
		// * b) Declare another String rev value as ""
		String rev="";
		
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		
		//* c) Iterate over the String in reverse order
		for (int i = length-1; i>=0; i--) {
		
		// * d) Add the char into rev
			rev=rev+charArray[i];
		}
		// * e) Compare the original String with the reversed String, if it is same then print palinDrome 
if (str.equals(rev)) {
	
	System.out.println("String is a palindrome");
	
}
else
	// * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	
{
	System.out.println("String is not a palindrome");
	}
	}

}
