package com.aspire.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet<>();
		System.out.println(ts.isEmpty());
		ts.add("Aishwarya");
		ts.add("Akshay");
		ts.add("Abhishek");
		ts.add("Akash");
		ts.add("A");
//		ts.add(1215);
//		ts.add(1215);
//		ts.add(145);
//		ts.add(5667);
//		ts.add(1578);
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		ts.add("Aspire");
		System.out.println(ts);
		ts.remove("Ajinkya");
		System.out.println(ts);
		System.out.println(ts.contains("Abhishek"));
//foreach loop		
		System.out.println("foreach loop");
		for(Object i:ts)
		{
			System.out.print(i+",");
		}
//iterator cursor
		System.out.println("\nIterator cursor");
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}		
	}
}