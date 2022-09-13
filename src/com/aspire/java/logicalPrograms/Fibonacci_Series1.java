package com.aspire.java.logicalPrograms;

public class Fibonacci_Series1 
{
	public static void main(String[] args) 
	{
		int series=10;
		int fab=1;
		int pre=1;
		int pre2=0;
		System.out.print(pre2+" "+pre+" ");
	
		for(int i=series-2; i>=1;i--)
		{			
			fab=pre+pre2;
			pre2=pre;
			pre=fab;
			System.out.print(fab+" ");
		}
		
	}
}
