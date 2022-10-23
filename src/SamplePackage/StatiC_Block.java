package SamplePackage;

public class StatiC_Block 
{
	static 
	{
		System.out.println("First static block");
	}
	
	static
	{
		System.out.println("2nd static block");
	}
	
	public static void main(String[] args)
	{
		System.out.println("\nIn main() method");
	}
}

/*https://www.bing.com/search?q=%5Cu000d&cvid=1f747f9f0b0c4053b4192068214d90f9&aqs=edge..69i57j0l8.897j0j1&pglt=43&FORM=ANNTA1&PC=U531
// new Character(' \u000d System.out.println("Hello");
\u000d System.out.println("Check"); 
/*

/*First static block
2nd static block

In main() method*/
