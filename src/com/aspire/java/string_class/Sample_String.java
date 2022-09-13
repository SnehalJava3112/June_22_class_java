package com.aspire.java.string_class;
/*
1.  toUpperCase();		2.  toLowerCase();
3.  length()			4.  contains()
5.  equalsIgnoreCase()	6.  equals(s1)
7.  isEmpty()			8.  charAt(indexNumber)
9.  endsWith("")		10. startsWith("Institute")
11. substring(4)		12. substring(4, 7)
13. concat(s1)			14. indexOf('')
15. lastIndexOf('')		16. replace("", "")
17. String ar[] = s4.split("")
*/

public class Sample_String 
{
	public static void main(String[] args) 
	{
		String str = "Sharvil Shailendra Patil.";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("+++++++++++2++++++++++++");

		System.out.println(str.length());
		System.out.println(str.contains("Patil"));
		System.out.println(str.contains("patil"));
		System.out.println("+++++++++++4++++++++++++");
		
		String s1 = "Snehal";
		String s2 = "snehal";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));		
		System.out.println("+++++++++++6++++++++++++");
	
		String s3 = "";		// empty string
		String s4 = " ";	// non empty string
		System.out.println(s3.isEmpty());
		System.out.println(s4.isEmpty());
		System.out.println(str.charAt(15));
		System.out.println("+++++++++++8++++++++++++");
		
		String s5 = "Patil.";
		String s6 = "Sharvil";
		System.out.println(str.endsWith(s5));
		System.out.println(str.endsWith("Patil"));
		System.out.println();
		
		System.out.println(str.startsWith(s5));
		System.out.println(str.startsWith(s1));
		System.out.println(str.startsWith(s6));
		System.out.println("++++++++++10++++++++++++");
		
		String s7 = "System.out.println()";
		System.out.println(s7.substring(6));		// 6 onwards
		System.out.println(s7.substring(8,16));		// 8 to (16-1) index
		System.out.println("++++++++++12++++++++++++");
		
		
		System.out.println(s1.concat(s4).concat(s2).concat(s4).concat(s5.toUpperCase()));
		System.out.println(str.indexOf("n"));
		System.out.println(s7.indexOf("o"));
		System.out.println("++++++++++14++++++++++++");
		
		System.out.println(str.lastIndexOf("S"));
		System.out.println(s7.lastIndexOf("."));
		
		String s8 = "Gk Rose Mansion, Punawale";
		System.out.println(s8.replace(" ","*"));    // replace change is not permanent
		System.out.println(s8.replace("Mansion","Arise"));
		System.out.println(s8);
		System.out.println("++++++++++16++++++++++++");
		
		String s9 = "Manual, Automation, Selenium, Unix, Maven";
		System.out.println(s9);
		String arr [] = s9.split(",");
	
		for(int i =0; i<=(arr.length-1) ; i++)
		{
			System.out.print(arr[i]+"");
		}
	}
}
/*
SHARVIL SHAILENDRA PATIL.
sharvil shailendra patil.
+++++++++++2++++++++++++
25
true
false
+++++++++++4++++++++++++
false
false
true
+++++++++++6++++++++++++
true
false
d
+++++++++++8++++++++++++
true
false

false
false
true
++++++++++10++++++++++++
.out.println()
ut.print
++++++++++12++++++++++++
Snehal snehal PATIL.
14
7
++++++++++14++++++++++++
8
10
Gk*Rose*Mansion,*Punawale
Gk Rose Arise, Punawale
Gk Rose Mansion, Punawale
++++++++++16++++++++++++
Manual, Automation, Selenium, Unix, Maven
Manual  Automation  Selenium  Unix  Maven 
*/