package com.aspire.java.array;

// create an array of (10, 25.5, asha, S)

public class Sample_Heterogenious_Data 
{
	public static void main(String[] args) 
	{
		Object[] x = new Object[]{10, 25.5, "Asha", 'S'};
		for(Object abc:x)
		{
			System.out.println(abc);
		}
		
	}
}
