package week1.day2;

public class LearnstringInit {

	public static void main(String[] args) {

		// object is created for your String
		// literals(data)/value in literals one object will be created for accesing

		//String str1 = "welcome to Auto";

		// string operator
		// new keyword and memory will be alocated
		//String strnew = new String("Mother");

		String str = "welcome ";

		// 1.String length method
		int lengthstr = str.length();
		System.out.println("Length is " + lengthstr);

		// 2.Find a character in a string
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(4));

		// 3.Get the position of the character in a string
		int index = str.indexOf('w');
		System.out.println("index is " + index);

		// 4.Get the last position of the character in a string
		int lastindex = str.lastIndexOf('e');
		System.out.println("index is " + lastindex);

		// 5. convert a string into character array
		System.out.println("Complete strng is " + str);
		char[] chararray = str.toCharArray();

		for (int i = 0; i < chararray.length; i++) {
			System.out.println("Character array is[" + i + "]:" + chararray[i]);
		}
		
		// 6. convert a string into words
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println("Split is[" + i + "]:" + split[i]);
		}
		
		//7.Get a part of the string
		String substring = str.substring(8);
		System.out.println("Substring" +substring);
		String substring2 = str.substring(8, 12);
		System.out.println("Substring 2" +substring2);
		
		//8.Replace a character
		String replace = str.replace('e', 'E');
		System.out.println("replace" +replace);
		
		//9.Replace all integers and non integers
		String str2="Testleaf-01233";
		String replaceall =str2.replaceAll("[//D]","");
		String replaceall2 =str2.replaceAll("[//d]","");
		System.out.println(replaceall);
		System.out.println(replaceall2);
		
		//10.compare two Strings
		String str11="Testleaf-01233";
		String str21="Testleaf-01233";
		String strnew2=new String("amma");
		String strnew3=new String("amma");
		if (str11.equals(str21)) {
			System.out.println("equal");
		}else
		{
			System.out.println("not equal");	
		}
		if (strnew2==strnew3) {
			System.out.println("same loc");
		} else {
			System.out.println("diff loc");
		}
	}

}
