package prac;

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
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"commonModal__close\"]"))).click();
		
		driver.findElement(By.xpath("(//span[@class=\"lbl_input appendBottom10\"])[1]")).click();
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));//sendKeys("Nanded");
		Thread.sleep(2000);
		src.sendKeys("nanded");
		Thread.sleep(1000);
		src.sendKeys(Keys.ARROW_DOWN);
		src.sendKeys(Keys.ENTER);
		
		
	}
}
