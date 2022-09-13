package com.aspire.java.loops;
// while and for is same functionally 
// but here while is used to reduce LOC.

//print no from 10 to 1

/*public class While_loop 
{

	public static void main(String[] args) 
	{
		int i=10;
		while(i>=1)
		{
			i--;   // try this before decrement
			System.out.println(i);
			//i--;
		}
	}
}*/

//*
//**
//***
//****
//*****

public class While_loop 
{

	public static void main(String[] args) 
	{
		int rows=1;
		while(rows<=5)
		{
			int star=1;
			while(star<=rows)
			{
				System.out.print("*");
				star++;
			}
			rows++;
			System.out.println();
		}
	}
}