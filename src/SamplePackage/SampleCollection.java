package SamplePackage;

import java.util.ArrayList;

public class SampleCollection {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		System.out.println(al.isEmpty());
		al.add("Sangeeta");
		al.add("namdeo");
		al.add(null);
		al.add(987654321);
		al.add("true");
		al.add(98.5);
		al.add("ivy");
		al.add("namdeo");
		al.add("life");
		al.add(true);
		al.add(987654309);
		al.add("pune");
		al.add(98.54);
		al.add(true);
		
		System.out.println(al);
//		System.out.println();
//		System.out.println(al.isEmpty());
//		System.out.println(al.get(3));
//		System.out.println(al.indexOf(98.5));
		System.out.println(al.lastIndexOf("true"));
		System.out.println(al.lastIndexOf(100));
	
		//System.out.println(al.lastIndexOf("pune"));
		//System.out.println(al.lastIndexOf(pune));
	
	}

}
