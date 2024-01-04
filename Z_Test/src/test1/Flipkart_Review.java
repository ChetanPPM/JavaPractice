package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_Review 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Z_Test\\Browser22\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@role=\"button\"]"))).click();
		Thread.sleep(2000);
		WebElement inp = driver.findElement(By.name("q"));
		inp.sendKeys("Redmi note 10 pro");
		Thread.sleep(2000);
		inp.sendKeys(Keys.ARROW_DOWN);
		inp.sendKeys(Keys.ENTER);
		Thread.sleep(2000);  
		String price = driver.findElement(By.xpath("(//div[@class=\"_30jeq3 _1_WHN1\"])[1]")).getText();
		System.out.println("Price is -->"+price);
	}
}
