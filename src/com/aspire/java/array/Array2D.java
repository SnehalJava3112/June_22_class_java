package com.aspire.java.array;

public class Array2D
{
	public static void main(String[] args) 
	{
		int rows=3;
		int column=4;
		
		int a[][] = new int [3][4];
		a[0][0]='A'; a[0][1]=01; a[0][2]=02; a[0][3]=03;
		a[1][0]=10; a[1][1]=11; a[1][2]=12; a[1][3]=13;
		a[2][0]=20; a[2][1]=21; a[2][2]=22; 
		//a[2][3]=23; // if not mentioned, compiler taking default value
		
//		System.out.print("Printing of Array int [][] a = \n");
//		for(int i=0; i<rows; i++)			// rows
//		{
//			for(int j=0; j<column; j++)		// column
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		

		int b[][] = {{5,10,15,20,1,2}, {25,40}, {45,50,55,60}, {9}};
		System.out.print("\nPrinting of Array int [][] b = \n");
		for(int i=0; i<b.length; i++)		    	// rows
		{
			for(int j=0; j<b[i].length; j++)		// column
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}