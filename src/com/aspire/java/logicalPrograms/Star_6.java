package com.aspire.java.logicalPrograms;

//    *
//   ***
//  *****
// *******
//*********

//*********
// *******
//  *****
//   ***
 //   *


public class Star_6
{
	public static void main(String[] args) 
	{
		// For upper star pyramid
		for(int rows=1; rows<=10; rows+=2)
		{
			for(int column=1; column<=10-rows; column+=2)
			{
				System.out.print(" ");
			}
			for(int tab=1;tab<=rows; tab++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		
		// For lower star pyramid
		for(int rows=9; rows>=0; rows-=2)
		{
			for(int column=1; column<=10-rows; column+=2)
			{
				System.out.print(" ");
			}
			for(int tab=1;tab<=rows; tab++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}

