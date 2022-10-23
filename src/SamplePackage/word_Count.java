package SamplePackage;

public class word_Count 
{
	public static void main(String[] args) 
	{
		int countupper=0;
		int countlower=0;
		int specialchar=0;
		int digit=0;
		int count=0;
		String s="Hi Wel-come to @Class @7.00am !";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
				countlower++;
			else if(ch[i]>='A' && ch[i]<='Z')
				countupper++;
			else if(ch[i]>='0' && ch[i]<='9')
				digit++;
			else if(ch[i]==' ')
				count++;
			else
				specialchar++;
		}
		System.out.println("countlower="+countlower);
		System.out.println("countUpper="+countupper);
		System.out.println("Digitcount="+digit);
		System.out.println("specialchar="+specialchar);
	}
}
