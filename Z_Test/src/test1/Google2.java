package test1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Z_Test\\Browser22\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Redmi mobile");
		
		List<WebElement> data = driver.findElements(By.xpath("//ul[@jsname=\"bw4e9b\"]/li//div/div[@class=\"wM6W7d\"]/span"));
		for(WebElement s1:data)
		{
			String txt=s1.getText();
			if(txt.equalsIgnoreCase("redmi mobile under 15000"))
			{
				s1.click();
				break;
			}
		}
	}

}
