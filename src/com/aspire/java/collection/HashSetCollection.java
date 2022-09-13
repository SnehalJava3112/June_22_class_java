package com.aspire.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetCollection 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet<>();
		System.out.println(hs.isEmpty());
		hs.add("Aishwarya");
		hs.add("Saturwar");
		hs.add(987654321);
		hs.add(92.56);
		hs.add(null);
		hs.add('A');
		hs.add(true);
		hs.add("Saturwar");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.add("Aspire");
		System.out.println(hs);
		hs.remove(987654321);
		System.out.println(hs);
//foreach loop		
		System.out.println("foreach loop");
		for(Object i:hs)
		{
			System.out.print(i+",");
		}
//iterator cursor
		System.out.println("\nIterator cursor");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}

	}
}