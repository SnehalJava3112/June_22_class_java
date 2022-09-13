package SamplePackage;

public class EvenOddNo 
{
	public static void main(String[] args)
	{
		int arr [] = {1,2,3,4,5};
		int even = 0, odd = 0;
		for(int t=0; t<arr.length; t++)
		{
			if(arr[t] %2 == 0)
			{
				even++;
			}	
			else
			{
				odd++;
			}
		}
		System.out.println("Even no count = "+even);
		System.out.println("Even no count = "+odd);
		
	}
}
