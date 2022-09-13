package com.aspire.java.superThisKeyword;

class Parent1
{
	Parent1()
	{
		System.out.println("This is parent class constructor");
	}
}

class Child1 extends Parent1
{
	Child1()
	{
		super();
		System.out.println("This is child class constructor");	
	}
}

public class Constructor_inheritance extends Child1
{
	public static void main(String[] args) 
	{
		new Constructor_inheritance();  // object not used further, so without objectname, put new and classname.
	}
}
