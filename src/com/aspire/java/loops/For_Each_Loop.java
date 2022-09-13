package com.aspire.java.loops;

public class For_Each_Loop 
{
	public static void main(String[] args) 
	{
		int[] a= {5,7,9,1,5,6,8,4,2,1,6,8,4};
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		for(int temp:a)
		{
			System.out.print(temp+",");
		}
	}
}