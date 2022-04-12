package testngSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	@Test(invocationCount=10,priority=2)
	public void loginTest()
	{
		System.out.println("login test");
	}
	@Test(invocationCount=2,priority=1)
	public void HomePageTest()
	{
		System.out.println(" Home Page test");
	}

}
