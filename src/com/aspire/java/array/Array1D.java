package com.aspire.java.array;
import java.util.Arrays;

// last index = length-1
// length is non static method
// sort() is static method -> after sorting array index changed
// sorting of string array is possible
// a=65;l A=97
public class Array1D 
{
	public static void main(String[] args)
	{
		int a;
		String b="Snehapank";
		
		int[] c= {7,5,88,9,'A',66,3,5562,9,4,0,34};
		System.out.println(c[4]);	// for char its showing ascii value
		System.out.println(c[6]);

		a=c[0]+c[1];
		System.out.println("a = "+a);
		
		String[] d = {"anita","Snehal","Patil","patil"};
		System.out.println(d[2]);
		System.out.println("length = "+d.length);
		
		int e[] = new int[5];
		e[0]=2; e[1]=4; e[2]=5; 
		e[3]=7; e[4]=12; 
		// e[5]=4;	Array index out of bound.
		
		System.out.print("Printing of Array e = ");
		for(int i=0; i<e.length; i++)
		{
			System.out.print(e[i]+",");
		}
		
		System.out.print("\nSorting of array e  = ");
		Arrays.sort(e);
		for(int i=0; i<e.length; i++)
		{
			System.out.print(e[i]+",");
		}
		
		System.out.print("\nReverse of array e  = ");
		for(int j=e.length-1; j>=0; j--)
		{
			System.out.print(e[j]+",");
		}
	}
}