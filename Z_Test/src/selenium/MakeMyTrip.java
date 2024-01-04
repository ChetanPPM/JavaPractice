package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Z_Test\\browser4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='commonModal__close']"))).click();
		}
		catch (Exception e)
		{
			driver.navigate().refresh();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='commonModal__close']"))).click();
		}
		driver.findElement(By.xpath("(//span[@class=\"lbl_input appendBottom10\"])[1]")).click();
		Thread.sleep(1000);
		WebElement src = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
		src.sendKeys("Mumbai");
		Thread.sleep(1000);
		src.sendKeys(Keys.ARROW_DOWN);
		src.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class=\"lbl_input appendBottom10\"])[2]")).click();
		WebElement dest = driver.findElement(By.xpath("//input[@placeholder='To']"));
		
		Thread.sleep(1000);
		src.sendKeys("Nagpur");
		Thread.sleep(1000);
		src.sendKeys(Keys.ARROW_DOWN);
		src.sendKeys(Keys.ENTER);
	}


}
