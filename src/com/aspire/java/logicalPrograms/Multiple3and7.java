package com.aspire.java.logicalPrograms;

// 1 to 80 Multiples of 3 and 7
// 21,42,63,..

public class Multiple3and7 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=80; i++)
		{
			if(i%3 == 0 && i%7 == 0)
			{
				System.out.println(i);
			}
		}
	}
}