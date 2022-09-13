package com.aspire.java.collection;

import java.util.HashMap;

public class Map 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String> ();
		hm.put(1, "Poonam");
		hm.put(2, "Arjun");
		hm.put(2, "Jyoti");
		hm.put(3, "Komal");
		hm.put(4, "Komal");
		hm.put(5, "Pradnya");
		hm.put(6, "Nitin");
		hm.put(7, "Rupa");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.containsKey(6));
		System.out.println(hm.containsValue("Nitin"));
		String a=hm.get(5);
		System.out.println(a);
		
		hm.remove(6);
		System.out.println(hm);
		
		hm.remove(4, "Komal");
		System.out.println(hm);
		
		hm.put(7, "Komal");
		hm.replace(1, "Nitin");
		System.out.println(hm);
		
		hm.replace(2, "Jyoti", "Nitin");
		System.out.println(hm);
		
	}
}