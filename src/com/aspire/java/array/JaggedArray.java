package com.aspire.java.array;

public class JaggedArray 
{
	public static void main(String[] args) 
	{
		//int a [][] = new int[2][];
		int a [][] = {{10,20,30,40}, {50,60}, {70,80,90}};
		
		System.out.println("a = "+a);        // hash value
		System.out.println("a[0] = "+a[0]);
		System.out.println("a.length = "+a.length);
		
		System.out.println("a[0].length = "+a[0].length);
		System.out.println("a[0][0] = "+a[0][0]);
		
		System.out.println("Array a[][] = ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
