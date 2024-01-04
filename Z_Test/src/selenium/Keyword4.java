package selenium;

import org.testng.annotations.Test;

public class Keyword4 
{
	@Test(priority=3)
	public void M1() 
	{
		System.out.println("M1 test case");
	}
	@Test(priority=1)
	public void M2() 
	{
		System.out.println("M2 test case");
	}
	@Test(priority=0)
	public void M3() 
	{
		System.out.println("M3 test case");
	}

}
