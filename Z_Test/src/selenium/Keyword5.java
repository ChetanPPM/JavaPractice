package selenium;

import org.testng.annotations.Test;

public class Keyword5 
{
	@Test(dependsOnMethods="M3")
	public void M1() 
	{
		System.out.println("M1 test case");
	}
	@Test()
	public void M2() 
	{
		System.out.println("M2 test case");
	}
	@Test(dependsOnMethods="M2")
	public void M3() 
	{
		System.out.println("M3 test case");
	}

}
