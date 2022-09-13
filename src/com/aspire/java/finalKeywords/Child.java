package com.aspire.java.finalKeywords;

public class Child extends Parent
{
	final int a=50;
	int b=100;
	
	public void bunglow()
	{
		System.out.println("Child bunglow");
	}

	//public void farm(){}		// Cannot override the final method from Parent
	
	public static void main(String[] args)
	{
		Child c = new Child();
		System.out.println("a in child = "+c.a);
		//a=a+b;		// cannot assign to final variable. only you can use it.
		
		Parent p = new Parent();
		System.out.println("a in parent = "+p.a);
	}
}
