package SamplePackage;
// 0 1 1 2 3 5 8 13 21...
public class Fibonacci 
{
	public static void main(String[] args)
	{
		int a=0, b=1;
		System.out.print("Fiboncci Series : ");
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2; i<=16; i++)
		{
			int c = a+b;
			System.out.print(c+" ");
			a=b; b=c;
		}
	}

}
