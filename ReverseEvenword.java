package week1.day2;

public class ReverseEvenword {

	public static void main(String[] args) {

		//	 * Declare the input as Follow
  		String test = "I am a software tester"; 
		
  		//a) split the words and have it in an array
  		String[] var1 = test.split(" ");
		String var2 = "";
		
		//b) Traverse through each word (using loop)
		for(int i=0; i < var1.length; i++) {
			
		//c) find the odd index within the loop (use mod operator)	
			if(i%2 == 1) {
				var2 = var2 + new StringBuilder(var1[i]).reverse().toString()+" ";
			}
			
		//e)print the even position words in reverse order using another loop (nested loop)
			else 
		
		//f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
			{
				var2 = var2 + var1[i] + " ";
			}
		}
		System.out.println(var2);
	}


}
