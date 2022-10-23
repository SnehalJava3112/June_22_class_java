package SamplePackage;

public class CharCount 
{

	public static void main(String[] args) 
	{
		String s ="selenium";
		int count = s.length();
		System.out.println("count="+count);
		int totalcount=s.replace("e", "").length();
		System.out.println("Totalcount="+ totalcount);
		int countafter=count-totalcount;
		
	     System.out.println("e="+countafter);
	}
}