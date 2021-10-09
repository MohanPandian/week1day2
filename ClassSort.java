package week1.day2;

import java.util.Arrays;

public class ClassSort {

	public static void main(String[] args) {

		int[] numarr = { 100, 49, 398, 34, 1, 267 };

		int length = numarr.length;

		// to print all the elements of the array
		
		System.out.println("for loop");
		for (int i = 0; i < numarr.length; i++) {
			System.out.println(numarr[i]);
		}
		
		
		Arrays.sort(numarr);
		System.out.println("sorted output");
		for (int i = 0; i < numarr.length; i++) {
			System.out.println(numarr[i]);
		}

		System.out.println("Largest number is " +numarr[length - 1]);	
		System.out.println("Second Largest number is " +numarr[length - 2]);
		System.out.println("Smallest Number is " +numarr[0]);
		System.out.println("Second Smallest Number is " +numarr[1]);

	}

}
