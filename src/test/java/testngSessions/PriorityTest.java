package testngSessions;

import org.testng.annotations.Test;

public class PriorityTest {
	//always non priority based executes first
	//if the same priority then alphabetical order it will executes
	//if the priority is char then it will take ascii
	//so never give char as priority.
	@Test(priority=2)
	public void a_test()
	{
		System.out.println("a test");
	}
	@Test(priority=1)
	public void b_test()
	{
		System.out.println("b test");
	}
	@Test(priority=1)
	public void c_test()
	{
		System.out.println("c test");
	}
	@Test(priority=0)
	public void d_test()
	{
		System.out.println("d test");
	}
	@Test(priority=-1)
	public void e_test()
	{
		System.out.println("e test");
	}
	@Test
	public void f_test()
	{
		System.out.println("f test");
	}
	@Test(priority='a')//not suggested
	public void g_test()
	{
		System.out.println("agtest");
	}

}
