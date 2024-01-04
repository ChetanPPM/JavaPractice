package javaPrac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\javaprogram\\\\Z_Test\\\\Browser22\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("lenovo");
		
		List<WebElement> data = driver.findElements(By.xpath("//ul[@jsname=\"bw4e9b\"]/li"));
		for(WebElement s1:data)
		{
			String text = s1.getText();
			if(text.equals("lenovo laptop"))
			{
				s1.click();
			}
		}
		

	}
}
