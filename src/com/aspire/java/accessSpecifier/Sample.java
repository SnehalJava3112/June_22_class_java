package com.aspire.java.accessSpecifier;

import java.util.Date;

public class Sample 
{
	private void method1()
	{
		System.out.println("Private Method");
	}
	
	protected void method2()
	{
		System.out.println("Protected Method");
	}
	
	void method3()
	{
		System.out.println("Default Method");
	}
	
	public void method4()
	{
		System.out.println("Public Method");
	}
	
	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d);
		
		//Same class method execution
		Sample object = new Sample();
		object.method1();
		object.method2();
		object.method3();
		object.method4();		
	}
}
