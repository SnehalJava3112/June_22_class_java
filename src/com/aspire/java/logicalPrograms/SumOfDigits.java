package com.aspire.java.logicalPrograms;

// 546 = 5+4+6 = 15

public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		int num=546;
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
