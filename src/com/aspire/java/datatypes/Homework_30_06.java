package com.aspire.java.datatypes;

public class Homework_30_06 
{
	public static void main(String[] args) 
	{	
	//  1. Write a Java program to print the sum of two numbers.
		
		int no1 = 75, no2 = 88;
		int sum;
		sum = no1 + no2;
		System.out.println("1. Sum of two numbers = "+sum);
		
	//  2. Write a Java program to divide two numbers
		
		int no3 = 88, no4 = 21, div;
		div = no3/no4;
		System.out.println("2. Division of two int numbers = "+div);
		
		float div1, n1 = 12.20f, n2 = 5.2f;
		div1 = n1/n2;
		System.out.println("   Division of two float numbers = "+div1);
		
	//  3. Write a Java program to print the area and perimeter of a circle
		
		float pi = 3.14f, r=5, area, peri;
		area = pi *r *r;
		peri = 2 * pi *r;
		System.out.println("3. Area of circle = "+area+" and Perimeter of circle = "+peri);
		
	//  4. Write a Java program to know a number whether it is positive or negative.
		
		int num = -6; 
		if(num > 0)
		{
			System.out.println("4. Number "+num+" is positive.");
		}
		else if (num < 0)   // check for num = -5
		{
			System.out.println("4. Number "+num+" is negative.");
		}
		else  				// check for num = 0
		{
			System.out.println("4. Number "+num+" is neither postive nor negative. ");
		}
		
	//  5. Take two numbers and print the greatest number.
		
		int a = 15, b = 60;
		if(a>b)
		{
			System.out.println("5. Greatest number is "+a);
		}
		else
		{
			System.out.println("5. Greatest number is "+b);
		}
		
	}
}

/*Output : 
1. Sum of two numbers = 163
2. Division of two int numbers = 4
   Division of two float numbers = 2.346154
3. Area of circle = 78.5 and Perimeter of circle = 31.400002
4. Number -6 is negative.
5. Greatest number is 60
*/