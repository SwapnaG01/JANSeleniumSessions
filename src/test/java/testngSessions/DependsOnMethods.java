package testngSessions;

import org.testng.annotations.Test;

public class DependsOnMethods {
	//avoid dependency in tests
	//test cases --should be independant to each other.
	
	@Test
	public void loginTest()
	{
		System.out.println("login test");
		//int i=9/2;
	}
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest()
	{
		System.out.println("Home page test ");
		//int i=9/0;
	}
	@Test(dependsOnMethods={"loginTest","HomePageTest"})
	public void SearchTest()
	{
		System.out.println("Search pageTest");
	}
	

}
