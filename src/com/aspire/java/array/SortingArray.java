package com.aspire.java.array;
import java.util.*;

public class SortingArray 
{
	public static void main(String[] args) 
	{
		int[] arr= {7,5,88,9,'A',66,3,5562,9,4,0,34};
		
		// before sorting
		System.out.print("\nBefore sorting Array = ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}

		// sorting
		for (int i=0; i<arr.length; i++) 
	    {     
			int temp = 0; 
	        for (int j=i; j<arr.length; j++) 
	        {                           
	            if (arr[i]>arr[j]) 
	            {          
	                temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
	            }
	        }
	    }
		
		// after sorting
		Arrays.sort(arr);
		System.out.print("\nAfter sorting Array = ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
}

/* Output:

Before sorting Array = 7, 5, 88, 9, 65, 66, 3, 5562, 9, 4, 0, 34, 
After sorting Array = 0, 3, 4, 5, 7, 9, 9, 34, 65, 66, 88, 5562, 
*/