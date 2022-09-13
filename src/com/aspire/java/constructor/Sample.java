package com.aspire.java.constructor;

public class Sample 
{
	int a; int b;// instance var = non-static var
	
	Sample()
	{
		a=50; b=100;
	}
	Sample(int c, int d)
	{
		a=c; b=d;
	}
	
	public void addition()
	{
		int sum = a+b;
		System.out.println("Addition of "+a+" and "+b+" = "+sum);
	}
	
	public void multiplication()
	{
		int multi = a*b;
		System.out.println("Multiplication of "+a+" and "+b+" = "+multi);
	}
}
