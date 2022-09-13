package com.aspire.java.methods;

public class ParameterizedMethods 
{ 
	
	public static void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println(a + "+" + b + " = "+sum);
	}
	
	public static void substraction(int a, int b)
	{
		int sub=a-b;
		System.out.println(a + "-" + b + " = "+sub);
	}
	public void multiplication(int a, int b)
	{
		int mul=a*b;
		System.out.println(a + "*" + b + " = "+mul);
	}
	public void division(int x, int y)
	{
		int div=x/y;
		System.out.println(x + "/" + y + " = "+div);
	}
	
	public static void main(String[] args) 
	{
		// static methods -> direct call
		addition(10,20); addition(5, 15);
		substraction(20, 15);
		
		// non-static methods -> call by object
		ParameterizedMethods obj = new ParameterizedMethods();
		obj.multiplication(3, 4);
		
		obj.division(9, 7);
	}
}
