package SamplePackage;

public class Duplicate_Array 
{
	public static void main(String[] args)
	{
		
// int array	
		int arr[]= new int[] {10,11,5,8,10,11,12,8,11,9,7,11};
		System.out.print("Duplicate array element from int array = ");
		for(int i=0; i<=arr.length-1; i++) 
		{
			for(int j=i+1; j<=arr.length-1; j++) 
			{
				if(arr[i]==arr[j])
				{
						System.out.print(arr[i]+" ");
						break;
				}
			}
		}
		
/*
// String array		
		String str[] = {"Sharvil","Snehal","Patil","Sharvil"};
		System.out.print("Duplicate array element from string array = ");
		
		for(int i=0; i<str.length; i++)
		{
			for(int j=i+1; j<str.length; j++)
			{
				if(str[i]==str[j])
				{
					System.out.print(str[j]+" ");
					break;
				}
			}	
		}
		System.out.println();
*//*		
// duplicate word from sentence
		System.out.print("Duplicate array element from sentence = ");
        String name ="My name is snehal Snehal is my name";
		String []word = name.split(" ");
	
		for(int i=0; i<word.length; i++)
		{
			for(int j=i+1; j<word.length; j++)
			{
				if(word[i].equals(word[j]))
				{
					System.out.print(word[i]+" ");
					break;
				}
			}	
		}	
		System.out.println();
*//*		
// print ASCII value or char
		int a[]= {'A','B','C','D','E','F'};
		System.out.println("ASCII value = "+a[0]);
		System.out.println("Array char element = "+(char)a[0]);
*/
	}
}





