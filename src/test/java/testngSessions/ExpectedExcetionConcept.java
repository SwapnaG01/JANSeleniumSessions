package testngSessions;

import org.testng.annotations.Test;

public class ExpectedExcetionConcept {
	String name;
	
	@Test(expectedExceptions= {NullPointerException.class, ArithmeticException.class})
	public void loginTest()
	{
		System.out.println("login test");
	    int i=9/0;
	    System.err.println(i);
	   // ExpectedExcetionConcept obj=null;
	  // obj.name="tom";
	   
	}
	

}
