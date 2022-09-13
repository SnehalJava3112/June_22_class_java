package com.aspire.java.logicalPrograms;


//*
//**
//***
//****
//***** 
//****
//***
//**
//*
//rows=5+4; star1=5; star2=4;

/*public class Star_4
{
	public static void main(String[] args) 
	{
		int rows;
		for(rows=1; rows<=5; rows++)
		{
			for(int star=1; star<=rows; star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(rows=1; rows<=4; rows++)
		{
			for(int star2=4; star2>=rows; star2--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/


//same pattern reducing LOC
//*
//**
//***
//****
//***** 
//****
//***
//**
//*

/*public class Star_4 
{
	public static void main(String[] args) 
	{
		int rows;   // here rows is global var
		for(rows=1; rows<=5; rows++)
		{
			for(int star1=1; star1<=rows; star1++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
		//System.out.println(rows);   //6
		
		while(rows<=9)   //6<=9   
		{
			for(int star2=rows; star2<=9; star2++)
			{
				System.out.print("*");			
			}
			rows++;
			System.out.println();
		}
	}
}
*/

//    *
//   **
//  ***
// ****
//*****
// ****
//  ***
//   **
//    *

/*public class Star_4
{
	public static void main(String[] args) 
	{
		for(int rows=1; rows<=5; rows++)
		{
			for(int tab=1; tab<=5-rows; tab++)
			{
				System.out.print(" ");
			}
			for(int star=1; star<=rows; star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int rows=1; rows<=4; rows++)
		{
			for(int tab=1; tab<=rows; tab++)
			{
				System.out.print(" ");
			}
			for(int star=4; star>=rows; star--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/
