package com.aspire.java.oops.generalization;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Medical Group => ");
		MedicalGroup m = new MedicalGroup();
		m.physics(); m.chemistry(); m.biology(); m.english();
		
		System.out.println("\nEngineering Group => ");
		EngineeringGroup e = new EngineeringGroup();
		e.physics(); e.chemistry(); e.mathematics(); e.english();
		
		System.out.println("\nArts Group => ");
		Arts a = new Arts();
		a.english(); a.history(); a.politicalScience();
		
		/*// You can make object od SuperGeneral.
		SuperGeneral g = new SuperGeneral();
		g.english();
		*/
	}
}
