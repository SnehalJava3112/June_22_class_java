
//		valid voter age		senior citizen 		valid marriage age		
// F		18					60						18
// M		18					60						21

package com.aspire.java.conditionalStatement;
public class Nested_if_1 
{	
	public static void main(String[] args) 
	{
		int age=21;  // try for 35
		String gender="Female";
		
		if( gender=="Male" || gender=="Female")
		{
			if(age>=60)
			{
				System.out.println("Valid senior citizen age for male and female");
			}
			if(age>=18)
			{
				System.out.println("valid voter age for male and female");
			}
			if(age>=18 && gender == "Female")
			{
				System.out.println("valid marriage age for female");
			}
			else if(age>=21 && gender == "Male")
			{
				System.out.println("valid marriage age for male");
			}
		}
	}
}



/*
public static void main(String[] args) 
	{
		{ // two opening brackets are allowed here
			System.out.println("Hello");
		}
	}	

 */
