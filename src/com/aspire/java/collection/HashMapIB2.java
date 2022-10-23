package com.aspire.java.collection;

import java.util.HashMap;

public class HashMapIB2 
{
	public static void main(String[] args) 
	{
		String str ="My Snehal name is Snehal snehal";
		String[] str1 = str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String c : str1)
		{
			if(!map.containsKey(c))
				map.put(c, 1);
		}
		System.out.println(map);
		System.out.println("Count = "+map.size());
		
	}
}
/*Output = 
 {snehal=1, Snehal=1, name=1, is=1, My=1}
Count = 5
*/
