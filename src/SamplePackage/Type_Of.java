package SamplePackage;

public class Type_Of 
{
	public static void main(String[] args)
	{

		int a = 105;
		String str = "Snehal";
		int arr[] = new int [5];
	
		System.out.println("Type of a = " + ((Object)a).getClass().getSimpleName());
		System.out.println("Type of str = " + str.getClass().getSimpleName());  // only for non primitive data type
		System.out.println("Type of arr = " + arr.getClass().getSimpleName()); 
        
        int b = Integer.parseInt("1005");
        System.out.println("Type of b = " + ((Object)b).getClass().getSimpleName());
        
        String abc = Integer.toString(b);
        System.out.println("Type of abc = " + abc.getClass().getSimpleName());
	}
}