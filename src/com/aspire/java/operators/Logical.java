package com.aspire.java.operators;

public class Logical  // boolean values only
{
	public static void main(String[] args) 
	{
		int a=8, b=3, c=15;
		// AND=&&=both true, result true
		if(a>b && a>c) // (8>3 && 8>15)
		{
			System.out.println("AND true");
		}
		else
		{
			System.out.println("AND false");
		}

        // OR=||=one true, result true
		if(a>b || a>c) // (8>3 || 8>15)
		{
			System.out.println("OR true");
		}
		else
		{
			System.out.println("OR false");
		}
		
		// NOT= reverse the value
		if(!(a==b))     
		{
			System.out.println("1 'NOT' true");
		}
		if(!(b<=-a))	//(not(3<=-8))
		{
			System.out.println("2 'NOT' true");
		}
	}
}
