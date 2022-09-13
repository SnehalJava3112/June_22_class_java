package com.aspire.java.superThisKeyword;

//Java code for using this() to invoke current class constructor

public class ThisConstructor 
{
	int a; int b;

	//Default constructor
	ThisConstructor()
	{ 
		this(10, 20);
		System.out.println("Inside  default constructor \n");
	}
  
	//Parameterized constructor
	ThisConstructor(int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor");
		System.out.println(this.a);
	}

	public static void main(String[] args)
	{
		new ThisConstructor();
	}
}