package com.aspire.java.constructor;

public class StaticConstructor 
{
	static int a; 
	int b;// instance var = non-static var
	
	StaticConstructor()
	{
		a=70; b=100;
	}
	StaticConstructor(int c, int d)
	{
		a=c; b=d;
	}
	
	public void addition()
	{
		int sum = a+b;
		System.out.println("Addition of "+a+" and "+b+" = "+sum);
	}
	
	public static void main(String[] args) 
	{
		StaticConstructor object = new StaticConstructor(40,50);
		object.addition();
	}
}
