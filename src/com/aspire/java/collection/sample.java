package com.aspire.java.collection;

import java.util.TreeSet;

public class sample 
{
	public static void main(String[] args) 
	{
		String[] s= {"Poonam","Arjun","A","Jyoti","Komal","Pradnya","Nitin","","Rupa","15462"};
		
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
