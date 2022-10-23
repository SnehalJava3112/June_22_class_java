package SamplePackage;
import java.util.Scanner;

public class ascending_ArrayElement 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Array Elements:");
		Scanner s=new Scanner(System.in);
		
		int a[]=new  int [10];
		for(int num=0;num<a.length;num++)
		{
		 a[num]=s.nextInt();
		}
		  
		for(int i=0;i<a.length;i++)   
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//Asscending order
		System.out.println("Asscending Array");
		for(int arr:a)
		{
			System.out.print(arr+" ");
		}
		//Decending order
		System.out.println("\nDecsscending Array");
		for( int k=a.length-1;k>=0;k--)
		{
			System.out.print(a[k]+" ");
		}
	}
}
