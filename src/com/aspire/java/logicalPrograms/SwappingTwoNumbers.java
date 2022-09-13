package com.aspire.java.logicalPrograms;

// a=10  b=20;  After swapping a=20  b=10  

public class SwappingTwoNumbers 
{
	public static void main(String[] args) 
	{
		// with third variable
		int x=10, y=20, z;
		System.out.println("Before swapping : ");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		z=x; x=y; y=z;
		
		System.out.println("After swapping : ");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		// without third variable
		int a=10, b=20;
		System.out.println("\nBefore swapping : ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a=a+b;	//a=10+20=30
		b=a-b;	//b=30-20=10
		a=a-b;	//a=30-20=10
		
		System.out.println("After swapping : ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
