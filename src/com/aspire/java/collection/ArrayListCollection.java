package com.aspire.java.collection;
import java.util.ArrayList;

public class ArrayListCollection 
{
	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();
		System.out.println(al.isEmpty());
		al.add("Snehal");
		al.add("Patil");
		al.add(987654321);
		al.add(92);
		al.add(null);
		al.add(11);
		al.add('A');
		al.add(true);
		al.add("Dharigouda");
		al.add(null);
		al.add(null);
		/*
		System.out.println(al);
		System.out.println(al.size()); 
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf("Patil"));
		System.out.println(al.lastIndexOf("Dharigouda"));
		al.add("Aspire");
		System.out.println(al);
		al.remove(8); 
		al.remove(false);
		al.remove("11");
		// not possible by string name only consider index 
		System.out.println(al); 
		al.set(7, 56.78); 
		System.out.println(al); 
		*/
		int a=10; 
		int b=(int)al.get(3);  // typecast is compulsory bcoz all are objrcts in arraylist 
		int sum=a+b; 
		System.out.println("sum"+sum); 
		System.out.println(al.get(5)); 
// for each loop
		for(Object i:al) 
		{
			System.out.print(i+"/"); 
		} 
// for loop
		System.out.println(); 
		for(int j=0;j<al.size();j++)
		{
			System.out.print(al.get(j)+",");
		}
		
	}
	
}
	