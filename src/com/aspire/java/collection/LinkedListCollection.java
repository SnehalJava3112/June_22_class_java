package com.aspire.java.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListCollection 
{
	public static void main(String[] args) 
	{
	LinkedList ll = new LinkedList<>();
	System.out.println(ll.isEmpty());
	ll.add("Aishwarya");
	ll.add("Saturwar");
	ll.add(987654321);
	ll.add(92.56);
	ll.add(null);
	ll.add('A');
	ll.add(true);
	ll.add("Saturwar");
	ll.add(null);
	ll.add(null);
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println(ll.isEmpty());
	System.out.println(ll.indexOf("Saturwar"));
	System.out.println(ll.lastIndexOf("Saturwar"));
	ll.add("Aspire");
	System.out.println(ll);
	ll.remove(8);
	ll.remove(8);
	System.out.println(ll);
	ll.set(7, 56.78);
	System.out.println(ll);
	int a=10;
	int b=(int) ll.get(2);
	int sum=a+b;
	System.out.println(sum);
	System.out.println(ll.get(5));
//foreach loop		
	System.out.println("foreach loop");
	for(Object i:ll)
	{
		System.out.print(i+",");
	}
	System.out.println("\nfor loop");
//for loop
	for(int j=0;j<ll.size();j++)
	{
		System.out.print(ll.get(j)+",");
	}
//iterator cursor
	System.out.println("\nIterator cursor");
	Iterator itr = ll.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+",");
	}
//list_iterator cursor
	System.out.println("\n List_iterator cursor");
	ListIterator litr = ll.listIterator();
	while(litr.hasNext())
	{
		System.out.print(litr.next()+",");
	}
	System.out.println("\n List_iterator cursor in reverse direction");
	ListIterator lirev = ll.listIterator(ll.size());
	while(lirev.hasPrevious())
	{
		System.out.print(lirev.previous()+",");
	}
	
	}

}