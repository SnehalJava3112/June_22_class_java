package SamplePackage;

public class wordCount 
{
	public static void main(String[] args) 
	{
		String s="java java c++ selenium java c++";
		String[] word = s.split(" ");
		int count=0;
		for(int i=0;i<word.length;i++)
		{
			count=1;
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals( word[j]))
				 {
					count++;
					word[j]="0";
		         }
				
	       }
			//word[]={java 0 c++ selenium 0 0};
			
			if(word[i]!="0")
			{
				System.out.println(word[i]+" = "+count);
			}
		}

	}
}
