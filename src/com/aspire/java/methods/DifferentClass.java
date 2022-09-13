package com.aspire.java.methods;

public class DifferentClass 
{
	
	public static void method3()
	{
		System.out.println("Static method 3 from different class.");
	}
	
	public void method14()
	{
		System.out.println("non static method 14.");
	}
	public void method15()
	{
		System.out.println("non static method 15.");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Here class starts.");
		
		StaticMethodClass.method1();
		method3();
		System.out.println("Class ends");
	}
	
}              