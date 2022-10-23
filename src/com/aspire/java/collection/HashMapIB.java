package com.aspire.java.collection;

import java.util.HashMap;

public class HashMapIB
{
	public static void main(String[] args) 
	{
		String str=" My name is IBer my";
		String[] str1=str.split(" "); //str =[0My 1name 2is ]
	
		HashMap<String, Integer> map=new HashMap<String,Integer>();
	
		for(int i=1;i<str1.length;i++)
		{
			if(map.containsKey(str1[i]))
			{
//				int count=map.get(str1[i]);
//				map.put(str1[i], count+1);
			}
			else
			{
				map.put(str1[i], 1);
			}
		}
		System.out.println("Result="+map.size());
	}
}