package com.aspire.java.oops.polymorphism;

public class OverridingTest 
{
	public static void main(String[] args) 
	{
		OverridingParent p = new OverridingParent();
		p.jwellary();
		p.farm();
		p.bunglow();
		p.addition(10, 20);
	
		System.out.println();
		
		OverridingChild c = new OverridingChild();
		c.jwellary();
		c.farm();
		c.car();
		c.bunglow();
		c.addition(10, 20);
	}
}