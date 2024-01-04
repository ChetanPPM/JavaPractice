package selenium;

import org.testng.annotations.Test;

public class Keyword3
{
	@Test(timeOut=2)
	public void M1() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Chean");
	}

}
