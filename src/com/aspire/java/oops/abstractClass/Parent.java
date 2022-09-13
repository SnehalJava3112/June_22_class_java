package com.aspire.java.oops.abstractClass;

// static methods cannot be adstract

public abstract class Parent
{
	int a=10;
	public void bunglow()	// complete method
	{
		System.out.println("Parent bunglow");
	}
	
	public void bike() { }	// complete method without single stmt
	
	//public void farm();	// incomplete method, so make it abstract method with class as a abstract
	
	public abstract void farm();
	public abstract void car();
	abstract public void addition();
	
	//public abstract static void sample();
	public static void sample()
	{
		System.out.println("Sample() in parent");
	}
}