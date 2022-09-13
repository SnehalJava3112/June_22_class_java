package com.aspire.java.logicalPrograms;

//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 

/*public class Star_2 
{
	public static void main(String[] args) 
	{
		for(int rows=1; rows<=5; rows++)
		{
			for(int column=1; column<=5-rows; column++)
			{
				System.out.print(" ");
			}
			for(int tab=1;tab<=rows; tab++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}*/

//* * * * * 
// * * * * 
//  * * * 
//   * * 
//    * 

/*public class Star_2
{
	public static void main(String[] args) 
	{
		for(int rows=5; rows>=1; rows--)
		{
			for(int column=1; column<=5-rows; column++)
			{
				System.out.print(" ");
			}
			for(int tab=1;tab<=rows; tab++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}*/

//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
// * * * * 
//  * * * 
//   * * 
//    * 
// star1=5  rows1=5  space1=4
// star2=4  rows2=4  space2=4

public class Star_2 
{
	public static void main(String[] args) 
	{
		for(int rows=1; rows<=4; rows++)
		{
			for(int space=1; space<=5-rows; space++)
			{
				System.out.print(" ");
			}
			for(int star=1; star<=rows; star++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for(int rows=5; rows>=1; rows--)
		{
			for(int space=1; space<=5-rows; space++)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=rows; star++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}