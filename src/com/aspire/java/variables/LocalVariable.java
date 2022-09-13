package com.aspire.java.variables;

public class LocalVariable 
{
	static int a =90;			// global static(for method3) variable
	public void method1()
	{
		int a = 10;
		System.out.println("Method1="+a);  // local variable -> same method body
	}
	public void method2()
	{
		int a = 45;				// local variable for method2
		System.out.println("Method2="+a);  // a cannot be accessed outside method
	}
	
	public static void method3()
	{
		System.out.println("Method3="+a);	   // a is not global here so not accessed in static method too
								   			   // so make is global so anybody can access.
	}
	
	public static void main(String[] args) 
	{
		LocalVariable object = new LocalVariable();
		object.method1();
		object.method2();
		
		method3();			// static method
	}
	
}
