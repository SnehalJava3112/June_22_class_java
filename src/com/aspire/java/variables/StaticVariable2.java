package com.aspire.java.variables;

public class StaticVariable2
{
	int id;
	String name;
	static String company="CEOP";
	
	StaticVariable2(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public void display()
	{
		System.out.println("Id = "+id+"\nName = "+name+"\nCompany = "+company);
	}
	public static void main(String[] args) 
	{
		StaticVariable2 obj1 = new StaticVariable2(1,"Snehal");
		obj1.display();
		
		StaticVariable2 obj2 = new StaticVariable2(2,"Sharvil");
		obj2.display();
	}
}
