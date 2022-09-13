package com.aspire.java.methods;

import com.aspire.java.methodsFromDifferentPackage.Methods;

public class StaticMethodClass 
{
	
	public static void method1()
	{
		System.out.println("Static methods 1 from same class.");
	}
	
	public static void method2()
	{
		System.out.println("Static methods 2 from same class.");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Program starts here.");
		method1();
		method2();
		
		Methods.method5();
		System.out.println("Program ends here.");	
	}	
}