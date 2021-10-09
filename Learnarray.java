package week1.day2;

import java.util.Arrays;
import java.util.Collections;

public class Learnarray {

	public static void main(String[] args) {
		
		//Array Initilaisation
		int[] numarr= {12, 133, 14, 133, 106, 16};
		
		//size of the array/number of elements
		//length-property
		int length = numarr.length;
		System.out.println("The size of the length " +length);
		
		//how to access the element of the array - index
		System.out.println(numarr[2]);
		
		//last element to fetch
		System.out.println(numarr[length-1]);
		System.out.println(numarr[length-2]);
		
		//first element to fetch
		System.out.println(numarr[0]);
		
		//to print all the elments of the array
		System.out.println("for loop");
		for (int i=0;i<numarr.length;i++)
		{
			System.out.println(numarr[i]);
		}
		
		//System.out.println(numarr[length]);
		//numarr.length1=numarr[7];
		//System.out.println("Array index out of bound exception");
		
		 //Sorting the order
		Arrays.sort(numarr);
		System.out.println("sorted output for ascending");
		for (int i=0;i<numarr.length;i++) {
			System.out.println(numarr[i]);
		}

		System.out.println("sorted output for descending");
		for (int i=0;i<numarr.length;i++) {
			System.out.println(numarr[i]);
		}
		
		
	}

}
