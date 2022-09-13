package com.aspire.java.logicalPrograms;
import java.util.*;

// Scanner() is non-static so we creating object

public class EvenNum 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter lowest no1 = ");
		int a = scan.nextInt();
		
		System.out.println("Enter highest no2 = ");
		int b = scan.nextInt();
		
		System.out.println("Even nos between "+a+" and "+b+" = ");
		for(int i=a; i<=b; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
				
		}
	}
}
