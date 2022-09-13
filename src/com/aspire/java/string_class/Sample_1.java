package com.aspire.java.string_class;

// ==        -> object checking (const, non-const)
// .equals() -> text cheking only
//.equalsIgnoreCase -> text cheking only -> ignore case sensitivity

public class Sample_1 
{	
	public static void main(String[] args) 
	{
		String a="Snehal";					// const string pool area
		String c="Snehal";				
		
		String b= new String("Snehal");		// non-const string pool area
		String d= new String("Snehal");		
		
		System.out.println(a==c);			// t // checking object here after checking text
		System.out.println(b==c);			// f
		System.out.println(b==d);			// f // non-const must be different 
		
		System.out.println();
		System.out.println(a.equals(c));  // t  only text checking
		System.out.println(b.equals(c));  // t
		System.out.println(b.equals(d));  // t
	
		System.out.println();
	  //String a="Snehal";
		String e="snehal";    
		System.out.println(a==e);                   // f case sensitivity matters 
		System.out.println(a.equals(e));	        // f only text check with case sensitivity
		System.out.println(a.equalsIgnoreCase(e));	// t only text check without case
	}

}
/*
true
false
false

true
true
true

false
false
true
*/