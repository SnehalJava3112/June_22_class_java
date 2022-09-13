package com.aspire.java.conditionalStatement;

public class Else_if_2 
{
	public static void main(String[] args) 
	{
		int budget=20000;
		
		if(budget>=100000)
		{
			System.out.println("Iphone");
		}
		else if(budget>=30000)
		{
			System.out.println("Onelpus");
		}
		else if(budget>=20000)
		{
			System.out.println("Samsung");
		}
		else if(budget>10000)
		{
			System.out.println("Redmi");
		}
		else if(budget>1000)
		{
			System.out.println("Feature phone");
		}
		else
		{
			System.out.println("Better luck next tiem");
		}
	}

}
