package SamplePackage;

public class mainMethodOveloading 
{
	public static void main(String[] args) 
	{
		int marks=98;
		String str = "Snehal";
		System.out.println("Name of student = "+str);
		System.out.println("Marks of Student = "+marks);
		
		main(10);
	}
	public static void main(int a)	// static methods can call directly without creating object
	{
		System.out.println("Oveloading main method");
	}
}