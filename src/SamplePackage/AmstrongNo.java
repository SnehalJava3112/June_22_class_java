package SamplePackage;

// AmstrongNo --> 153 = (1*1*1)+(5*5*5)+(3*3*3) = 1+125+27 = 153

public class AmstrongNo
{
	public static void main(String[] args) 
	{
// print amstrong no from 1 to 1000

		System.out.print("Amstrong no from 1 to 1000 = ");
		for(int check=1; check<1000; check++) 
		{
			int temp=0, sum=0;
			int no=check; 
			
			while(no>0)
			{
				temp = no%10; //3 5 1
				no=no/10;//153/10=15   //15/10=1
				sum=(temp*temp*temp)+sum;//0+(3*3*3)=27  //(5*5*5)+27+1
			}
			if(check==sum)	
			{
				System.out.print(check+" ");
			}
		}
	}
}		
