package com.aspire.java.logicalPrograms;

//Fibonacci Series : 1,1,2,3,5,8,13,..

public class Fibonacci_Series
{
	public static void main(String[] args) 
	{
		int a=1, b=1, c=0;
		System.out.print("1 1");
		while(c<=1000)
		{
			c=a+b;
			if(c>=100)
				break;
			
			else
				System.out.print(" ");
			
			System.out.print(c);
			a=b; b=c;
		}
	}
}