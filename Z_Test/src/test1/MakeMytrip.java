package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMytrip
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Z_Test\\Browser22\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("notification-frame-~2514310ca")));//notification-frame-~197139405
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]"))).click();
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(2000);
		WebElement src=driver.findElement(By.xpath("//input[@placeholder='From']"));
		src.sendKeys("Nagpur");
		Thread.sleep(2000);
		src.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		src.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(2000);
		WebElement dest=driver.findElement(By.xpath("//input[@placeholder=\"To\"]"));
		
		dest.sendKeys("Chennai");
		Thread.sleep(2000);
		dest.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		dest.sendKeys(Keys.ENTER);
	}

}
