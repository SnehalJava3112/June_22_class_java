package com.aspire.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class FullCollection 
{
	public static void main(String[] args) 
	{
		int[] a = {1,3,5,7,9,5,8,6,1,22,6,4,8,1};
		String[] s= {"Poonam","Arjun","A","Jyoti","Komal","Pradnya","Nitin","","Rupa","15462"};
		
//Arraylist
		ArrayList al=new ArrayList();
		for(int i=0; i<a.length; i++)
		{
			al.add(a[i]);
		}
		for(int j=0; j<s.length;j++)
		{
			al.add(s[j]);
		}
		System.out.println(al);
		
//vector
		Vector v = new Vector();
		for(int i=0; i<a.length; i++)
		{
			v.add(a[i]);
		}
		for(int j=0; j<s.length;j++)
		{
			v.add(s[j]);
		}
		System.out.println(v);
		
//Linkedlist
		LinkedList ll = new LinkedList();
		for(int i=0; i<a.length; i++)
		{
			ll.add(a[i]);
		}
		for(int j=0; j<s.length;j++)
		{
			ll.add(s[j]);
		}
		System.out.println(ll);
		
//Hashset
		HashSet hs = new HashSet<>();
		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]);
		}
		for(int j=0; j<s.length;j++)
		{
			hs.add(s[j]);
		}
		System.out.println(hs);
		
//LinkedHashset
		LinkedHashSet lhs = new LinkedHashSet<>();
		for(int i=0; i<a.length; i++)
		{
			lhs.add(a[i]);
		}
		for(int j=0; j<s.length;j++)
		{
			lhs.add(s[j]);
		}
		System.out.println(lhs);
		
//treeset		(one at a time)
		
		System.out.println("TreeSet");
		TreeSet tr = new TreeSet<>();
//		for(int i=0; i<a.length; i++)
//		{
//			tr.add(a[i]);
//		}
		for(int j=0; j<s.length;j++)
		{
			tr.add(s[j]);
		}
		System.out.println(tr);
	}
}