package com.aspire.java.oops.polymorphism;

public class OverridingChild extends OverridingParent	// Child class
{
	public void jwellary()
	{
		System.out.println("Child Jwellary");
	}
	public void farm()
	{
		System.out.println("Child Farm");
	}
	public void car()
	{
		System.out.println("Child Car");
	}
	// if we remove this method from child then c.addition(10,20)
	// finds first in child class, if not present then go to parent class
	// it finds in parent then it will execute from parent
	
	// searching first from current class then goes to others.
	
	public void addition(int a, int b)
	{
		int sum = a+a+b+b;
		System.out.println(sum);
	}
}
