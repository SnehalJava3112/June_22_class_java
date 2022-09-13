package com.aspire.java.methods;

public class ReturnTypeMethod2 
{
	public static int addition(int a, int b)
	{
		int sum=a+b;
		//System.out.println(a + "+" + b + " = "+sum);
		return sum;
	}
	
	public int substraction(int a, int b)
	{
		int sub=a-b;
		//System.out.println(a + "-" + b + " = "+sub);
		return sub;
	}
	public static void sample()
	{
		int a = 10;
		short b = 20;
		byte c = 30;   // smallest data type
		long d = 40;
		float e = 50.2f;
		double f = 60.3d;
		char g = 'z';
		boolean h = true;
		String i = "Aspire";
		//return i;    // every data type having return type.
	}
	
	public static void main(String[] args) 
	{
		int x=addition(12,14);
		
		ReturnTypeMethod2 obj = new ReturnTypeMethod2();
		int y= obj.substraction(20,10);
		
		int multi = x*y;
		System.out.println(multi);
		
	}
}
