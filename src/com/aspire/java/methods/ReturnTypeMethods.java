package com.aspire.java.methods;

// void = does not returning any value. non return method. 
//	    = execute the code only.

public class ReturnTypeMethods 
{
	public static int addition()
	{
		int a=20, b=30;
		int sum = a+b;
		//System.out.println(sum);
		return sum;//50
	}
	
	public static void main(String [] args)
	{
		
		
		int x = addition();//50
		System.out.println("Return value assigned to x = "+x);
	
		int y=40;
		int Summation = x+y;
		System.out.println(Summation);
	}
}
