package com.aspire.java.oops.interface1;

public class Child implements Interface1,Interface2	//child
{
	int a=10;
	static int b=20;
	public void farm() 
	{
		System.out.println("Parent farm");
	}
	
	public void bunglow()
	{
		System.out.println("Parent bunglow");
	}
	
	public void gold() 
	{
		System.out.println("Parent gold");
	}
	
	public void car() 
	{
		System.out.println("Parent car");
	}
}
