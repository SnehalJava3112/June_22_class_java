package com.aspire.java.logicalPrograms;

//    * *
//   ** **
//  *** ***
// **** ****
//***** *****
// rows=5; star=10; space=4+1

public class Star_9 
{
	public static void main(String[] args) 
	{
		for(int rows=1; rows<=5; rows++)
		{
			// left angle space
			for(int space=4; space>=rows; space--)
			{
				System.out.print(" ");
			}
			
			//left side star
			for(int star=1; star<=rows; star++)
			{
				System.out.print("*");
			}
			
			//right side star
			System.out.print(" ");
			for(int star=1; star<=rows;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}