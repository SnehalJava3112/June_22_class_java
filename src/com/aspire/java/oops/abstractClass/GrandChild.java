package com.aspire.java.oops.abstractClass;

public class GrandChild extends Child
{

	public void farm() 
	{
		System.out.println("GrandChild farm");
	}
	
	public void addition()
	{
		int sum = a+b;
		System.out.println("Sum = "+sum);	
	}
	
	public static void main(String[] args) 
	{
		GrandChild gc = new GrandChild();
		gc.farm();
		gc.bunglow();
		gc.car();
		gc.addition();
		sample();	// checking Grandchild-->Child -->Parent
	}
}
