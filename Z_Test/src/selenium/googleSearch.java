package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Z_Test\\browser4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("selenium");
		List<WebElement> allWeb = driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]/ul/li"));
		for(WebElement s1:allWeb)
		{
			String txt = s1.getText();
			if(txt.equalsIgnoreCase("selenium webdriver"))
			{
				s1.click();
			}
		}
		Thread.sleep(2000);
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<String>(allid);
		String id = al.get(1);
		driver.switchTo().window(id);
		
		driver.findElement(By.xpath("//h3[text()='WebDriver']")).click();
	}
}
