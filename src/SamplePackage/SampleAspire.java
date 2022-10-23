package SamplePackage;

public class SampleAspire 
{
	public static String method1(String name1)
	{
		String abc = name1;
		return abc;
	}
	
	public static void main(String[] args) 
	{
		String name =" Aspire";
		String fname = method1("Snehal")+name;
		System.out.println("Final name of student = "+fname);
		
		String fname2 = method1("Shailendra")+name;
		System.out.println("Final name of student = "+fname2);		
	}
}