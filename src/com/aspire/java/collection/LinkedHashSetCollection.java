package com.aspire.java.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCollection 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet<>();
		System.out.println(lhs.isEmpty());
		lhs.add("Aishwarya");
		lhs.add("Saturwar");
		lhs.add(987654321);
		lhs.add(92.56);
		lhs.add(null);
		lhs.add('A');
		lhs.add(true);
		lhs.add("Saturwar");
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		lhs.add("Aspire");
		System.out.println(lhs);
		lhs.remove(null);
		System.out.println(lhs);
//foreach loop		
		System.out.println("foreach loop");
		for(Object i:lhs)
		{
			System.out.print(i+",");
		}
//iterator cursor
		System.out.println("\nIterator cursor");
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
	}
}