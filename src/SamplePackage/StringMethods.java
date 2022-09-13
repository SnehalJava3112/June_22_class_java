package SamplePackage;

public class StringMethods 
{
	public static void main(String[] args) 
	{


		String str = "Sharvil, Snehal, Shailendra, Patil";
		System.out.println(str);
		String[] abc = str.split(",");
		System.out.println();
		for(int i=0; i<abc.length; i++)
		{
			System.out.print(abc[i]);
		}
		System.out.println();
		
		System.out.println((abc[3].concat(abc[1])).concat(abc[2]));
	}
}