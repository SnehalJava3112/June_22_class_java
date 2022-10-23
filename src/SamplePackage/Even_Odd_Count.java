package SamplePackage;
// Count of even and odd from 1-101
public class Even_Odd_Count
{
	public static void main(String[] args) 
	{
		int countEven = 0, countOdd = 0;
		for(int i=1; i<=101; i++)
		{
			if(i%2 == 0)
				countEven++;
			else
				countOdd++;
		}
		System.out.println("Even count = "+countEven);
		System.out.println("Odd count = "+countOdd);
	}
}
