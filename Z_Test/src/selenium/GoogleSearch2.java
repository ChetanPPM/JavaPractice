package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Z_Test\\Browser22\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("panvel");
		List<WebElement> data = driver.findElements(By.xpath("(//ul[@class=\"G43f7e\"])[1]//div[@class=\"eIPGRd\"]"));
		String s2="panvel pin code";
		for(WebElement s1:data)
		{
			String txt = s1.getText();
			if(txt.equalsIgnoreCase(s2))
			{
				s1.click();
			}
		}
		
//		Thread.sleep(2000);
//		Set<String> allId = driver.getWindowHandles();
//		ArrayList<String>al=new ArrayList<String>(allId);
//		String childId = al.get(1);
//		Thread.sleep(2000);
//		System.out.println(childId);
//		driver.switchTo().window(childId);
//		driver.findElement(By.xpath("//a[text()='Images']")).click();
//		Thread.sleep(2000);
		driver.quit();
	}
}
