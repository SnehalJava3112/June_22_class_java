package SamplePackage;

import java.util.HashMap;

//public class Duplicate_Array_Elements 
//{   
//	  public static void main(String[] args) throws CloneNotSupportedException 
//	    {
//	        int[] origArray = new int[] {1, 1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 6, 7, 8};
//	 
//	        for(int newArray : origArray)
//	        {
//	        	System.out.print(newArray+" ");
//	        }
//	        
//	        int [] tempArray = new int [origArray.length];
//	         
//	        int indexJ = 0;
//	        for (int indexI = 0; indexI < origArray.length - 1; indexI++) 
//	        {
//	            Integer currentElement = origArray[indexI];
//	             
//	            if (currentElement != origArray[indexI+1]) {
//	                tempArray[indexJ++] = currentElement;
//	            }
//	        }
//	         
//	        tempArray[indexJ++] = origArray[origArray.length-1];
//	        System.out.println();
//	        for(int newArray1 : tempArray)
//		    {
//	        	System.out.print(newArray1+" ");
//		    }
//	   }
//}
 /*
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Duplicate_Array_Elements 
{

	public static void main(String[] args) 
	{
		Integer a[]= {2,4,5,2,3,6,5,4,10,56,12,12,10};
		List<Integer>ls= Arrays.asList(a);
		TreeSet<Integer> ts=new TreeSet<Integer>(ls);
		for(Object element:ts)
		{
			System.out.print(element+" ");
		}
		
		Object array[]=ts.toArray();
		System.out.println();
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}*/
/*
public class Duplicate_Array_Elements
{
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };
        HashMap <Integer, Boolean> mp = new HashMap<>();
     
        for (int i = 0; i < arr.length; ++i) 
        {
                if (mp.get(arr[i]) == null)
                {
                    System.out.print(arr[i] + " ");
                    mp.put(arr[i], true);
                }
         }
    }
}*/

public class Duplicate_Array_Elements {
	 public static void main(String argu[]) {


	  String str = "w3schoo3ls";
	  int cnt = 0;
	  char[] inp = str.toCharArray();
	  System.out.println("Duplicate Characters are:");
	  for (int i = 0; i < str.length(); i++) {
	   for (int j = i + 1; j < str.length(); j++) {
	    if (inp[i] == inp[j]) {
	     System.out.println(inp[j]);
	     cnt++;
	     break;
	    }
	   }
	  }
	 }
	}