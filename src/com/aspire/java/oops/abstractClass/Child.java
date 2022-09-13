package com.aspire.java.oops.abstractClass;

public abstract class Child extends Parent
{
	int b=20;
	
	public void car() 
	{
		//System.out.println("Implementation provided in child class.");	
		System.out.println("Child farm");
	}
	abstract public void farm();
	public static void sample()
	{
		System.out.println("Sample() in child");
	}
}
