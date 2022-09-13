package com.aspire.java.logicalPrograms;

//    *
//   ***
//  *****
// *******
//*********
// rows=5; star=9; space=4
// left side star
//    *
//   **
//  ***
// ****
//*****
// right side star
// blank line = no star
//	*
//	**
//	****
//	*****
public class Star_7 
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
			for(int star=2; star<=rows;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}