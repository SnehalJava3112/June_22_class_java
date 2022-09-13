package com.aspire.java.finalKeywords;

//public class Parent extends GrandParent	// The type Parent cannot subclass the final class GrandParent
public class Parent
{
	int a=10;
	int b=20;
	
	public void bunglow()
	{
		System.out.println("Parent bunglow");
	}	 
	
	final void farm()
	{
		System.out.println("Parent farm");
	}
}
