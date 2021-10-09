package week1.day2;

public class Findtypes {

	public static void main(String[] args) {

		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		//b) Traverse through each character (using loop)
		for (int i = 0; i < test.length(); i++) {

		/*	c) Find if the given character is what type using (if)
			i)  Character.isLetter
			ii) Character.isDigit
			iii)Character.isSpaceChar
			iv) else -> consider as special character */	
			
			if (Character.isLetter(test.charAt(i))) {

				letter = letter + 1;

			} else if (Character.isDigit(test.charAt(i))) {

				num = num + 1;

			} else if (Character.isSpaceChar(test.charAt(i))) {
				space = space + 1;
			} else {
				specialChar = specialChar + 1;
			}

		}
		// Print the count here

		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}
}
