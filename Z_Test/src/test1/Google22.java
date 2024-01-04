package test1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google22
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Z_Test\\Browser22\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Dimension dm=new Dimension(800,600);
		driver.manage().window().setSize(dm);
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("CSMT");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> Data = driver.findElements(By.xpath("//ul[@jsname=\"bw4e9b\"]/li//div[@class=\"wM6W7d\"]/span"));
		for(WebElement s1:Data)
		{
			String txt = s1.getText();
			if(txt.equalsIgnoreCase("csmt full form"))
			{
				s1.click();
			}
		}
		
		driver.quit();
	}

}
