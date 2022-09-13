package com.aspire.java.logicalPrograms;
import java.util.*;

// 5! = 5*4*3*2*1 = 120

public class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter integer number = ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int fact = 1;
		
		for(int i=num; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" = "+fact);
	}
}
