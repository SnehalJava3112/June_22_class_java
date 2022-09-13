package com.aspire.java.oops.interface4;

interface I1 
{
	int a =10;			// public static final int a=10; 
	void show();		// public abstract void display();
}

interface I2
{
	void display();
	public default void addition()
	{
		int a=10, b=20;
		int sum=a+b;
		System.out.println("Sum = "+sum);
	}
}
public class Test implements I1, I2
{
	public void show() 
	{
		System.out.println("Show method");
	}
	public void display()
	{
		System.out.println("Display method");	
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show(); t.display(); t.addition();
	}
}
