package com.aspire.java.logicalPrograms;
import java.util.*;


public class UserInput 
{
	public static void main(String[] args) 
	{
		//int num=546;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number = ");
		int num = scan.nextInt();
		int sum=0;
	
		while(num > 0)
		{
			sum = sum + num%10;	// sum=6
			num = num/10;		// num=54
		}
		
		System.out.println("Sum = "+sum);
		System.out.println("Num = "+num);
	}
}