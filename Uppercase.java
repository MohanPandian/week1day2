package week1.day2;

public class Uppercase {

	public static void main(String[] args) {
		
		// * Declare the input as Follow
  		String test = "I am a software tester"; 
		String str="I am Software testter";
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0)
			{
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		

	}

}
