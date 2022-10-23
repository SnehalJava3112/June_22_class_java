package com.aspire.java.oops.polymorphism;

public class Overloading extends Parent
{ 
	int i=10, j=20, sum;
	public void addition()
	{
		sum=i+j;
		System.out.println("Sum1 = "+sum);
	}
	
	public void addition(int a)
	{
		sum=i+a;
		System.out.println("Sum2 = "+sum);
	}
	
	public void addition(int a, int b)
	{
		sum=a+b;
		System.out.println("Sum3 = "+sum);
	}
	
	public void addition(int a, int b,int c)
	{
		sum=a+b+c;
		System.out.println("Sum4 = "+sum);
	}
	
	public static void main(String[] args) 
	{
		Overloading obj = new Overloading();
		obj.addition();
		obj.addition(5);
		obj.addition(5,3);
		obj.addition(5,3,8);
		
		Parent p = new Parent();
		p.addition(100.5f);
		//see below code
		main();
		main(8);
	}
	// main method can be overload not override.
	public static void main() 
	{
		System.out.println("Here we overload the main method.");
	}
	public static void main(int a) 
	{
		System.out.println("Overload the parameterized main method.");
	}
}
