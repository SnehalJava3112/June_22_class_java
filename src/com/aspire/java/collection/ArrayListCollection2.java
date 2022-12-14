package com.aspire.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListCollection2 
{
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		System.out.println(al.isEmpty());
		al.add("Aishwarya");
		al.add("Saturwar");
		al.add(987654321);
		al.add(92.56);
		al.add(null);
		al.add('A');
		al.add(true);
		al.add("Saturwar");
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf("Saturwar"));
		System.out.println(al.lastIndexOf("Saturwar"));
		al.add("Aspire");
		System.out.println(al);
		al.remove(8);
		al.remove(8);
		System.out.println(al);
		al.set(7, 56.78);
		System.out.println(al);
		int a=10;
		byte c= (byte) a;
		int b=(int) al.get(2);
		int sum=a+b;
		System.out.println(sum);
		System.out.println(al.get(5));
////foreach loop		
		System.out.println("foreach loop");
		for(Object i:al)
		{
			System.out.print(i+",");
		}
		System.out.println("\nfor loop");
////for loop
		for(int j=0;j<al.size();j++)
		{
			System.out.print(al.get(j)+",");
		}
////iterator cursor
		System.out.println("\nIterator cursor");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
//list_iterator cursor
		System.out.println("\n List_iterator cursor");
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+",");
		}
		
		System.out.println("\n List_iterator cursor in reverse direction");
		ListIterator lirev = al.listIterator(al.size());
		while(lirev.hasPrevious())
		{
			System.out.print(lirev.previous()+",");
		}
	}
}