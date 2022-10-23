package SamplePackage;
import java.util.Scanner;

/* Input from user -> String=s.next() 
					  int=s.nextInt() 
					  double=s.nextDouble() 
					  char=s.next().charAt(0)	
*/

public class InputFromUser 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your  Name : ");
		String name = s.next();
		
		System.out.println("Enter your  Salary : ");
		int salary = s.nextInt();
		
		System.out.println("Enter your  Gender : ");
		char gender = s.next().charAt(0);
		
		System.out.println("Name    = "+name);
		System.out.println("Salary  = "+salary);
		System.out.println("Gender  = "+gender);
	}
}
