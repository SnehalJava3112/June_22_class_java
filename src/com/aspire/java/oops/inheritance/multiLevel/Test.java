package com.aspire.java.oops.inheritance.multiLevel;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("*****Parent****");
		Parent p = new Parent();
		p.farm();
		Parent.car();
		
		System.out.println("*****Parent_child****");
		Parent_child pc = new Parent_child();
		pc.farm(); pc.bunglow();
		Parent_child.car();
		
		System.out.println("*****Child****");
		Child c = new Child();
		c.farm(); c.bunglow(); c.jwellery();
		Child.car();
		
		c.addition();
	}
}