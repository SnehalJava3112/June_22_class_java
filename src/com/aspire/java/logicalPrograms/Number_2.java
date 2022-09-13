package com.aspire.java.logicalPrograms;

//1
//12
//123
//1234
//12345
//rows=5; count=5;

public class Number_2 
{
	public static void main(String[] args) 
	{
		for(int rows=1; rows<=5; rows++)
		{
			for(int count=1; count<=rows; count++)
			{
				System.out.print(count);
			}
			System.out.println();
		}
	}
}


