package test1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
	
		public static void main(String[] args) throws InterruptedException
		{
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Z_Test\\Browser22\\chromedriver.exe");
			WebDriver driver=new ChromeDriver(option);
			driver.get("https://www.redbus.in/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement src=driver.findElement(By.xpath("//*[@id=\"src\"]"));
			src.click();
			Thread.sleep(1000);
			src.sendKeys("Akot");
			Thread.sleep(2000);

			src.sendKeys(Keys.ENTER);
			
			WebElement dest=driver.findElement(By.xpath("//*[@id=\"dest\"]"));
			dest.click();
			Thread.sleep(1000);
			dest.sendKeys("panvel");
			Thread.sleep(2000);
			dest.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"Layer_1\"]")).click();
			
			String year="2024";
			String month="Aug";
			String date="26";
			driver.findElement(By.xpath("//*[@id=\"onwardCal\"]")).click();
			
			Thread.sleep(2000);
			while(true)
			{
				String MontYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
				
				String arr[] = MontYear.split(" ");
				String mon = arr[0];
				String yr=arr[1];
				if(mon.equalsIgnoreCase(month) && yr.equals(year))
					break;
				else
					driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
				
			}
			List<WebElement> alldate = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
			for(WebElement s1:alldate)
			{
				String value = s1.getText();
				if(value.equals(date))
				{
					s1.click();
					break;
				}
				
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Search Buses']")).click();

			
		}
}
