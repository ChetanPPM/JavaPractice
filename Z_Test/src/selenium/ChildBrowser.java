package selenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildBrowser
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("–disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Z_Test\\browser4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.findElement(By.xpath("//a[text()='Agile Project']")).click();
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("")));
		Set<String> allId = driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<String>(allId);
		String childID = al.get(1);
		driver.switchTo().window(childID);
		Thread.sleep(2000);
		
		WebElement uid=driver.findElement(By.xpath("//input[@name=\"uid\"]"));
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement btn=driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
		uid.sendKeys("Chetan");
		pwd.sendKeys("hsdodaodk");
		btn.click();


		
	}
}
