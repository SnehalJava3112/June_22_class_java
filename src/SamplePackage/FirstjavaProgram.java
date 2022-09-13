package SamplePackage;

public class FirstjavaProgram //public class classname
{
	public static void main(String[] args) // main + ctrl + spacebar
	{
		//System.out.println("Welcome to java world"); // syso +ctrl + spacebar
		//System.out.println("Its a great thing");
		//System.out.println("Snehal Patil"); //no single quotes
		
		int a=10, b=20;
		int min = (a<b) ? a:b;   // Ternary operator if() is true ->  go to a. if() is false -> go to b.
		System.out.println("Min = "+min);   
		
		//if(a<b) ? System.out.println(a): System.out.println(b);
		// here this operator is not used in conditional stmt bcoz if() gives boolean value.
		// so boolean is not converted into int, as a and b are int.
	}
}
