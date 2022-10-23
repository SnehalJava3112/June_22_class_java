package SamplePackage;

public class PrimeNo 
{
	public static void findPrimeNo()
	{
		//int no=50;
		System.out.println("Prime numbers from 1 to 100 = ");
		for(int no=1; no<=50; no++)
		{
		int count = 0;
		for(int i=1; i<=no; i++) 
		{
			if(no%i==0) 
			{
				count++; 
			}
		}
		if(count==2)
			System.out.print(no+" ");
			
		else
			count=0;	
		}
	}
	
	public static void main(String[] args) 
	{
		findPrimeNo();
	}
}

/*
		int no = 16;
		int count = 0;
		
		for(int i=2; i<=no-1; i++)
		{
			if(no%i == 0) 
				count++;
		}
		if(count==0)
				System.out.println("prime no");
		else
				System.out.println("not prime no");*/