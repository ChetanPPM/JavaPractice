package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class Flipkart_Price 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Z_Test\\Browser22\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/span"))).click();
		//driver.findElement(By.xpath("//span[@class=\"_30XB9F\"]")).click();
		WebElement srcBox = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		srcBox.click();
		srcBox.sendKeys("Redmi Note11 pro");
		srcBox.sendKeys(Keys.ENTER);
		String price = driver.findElement(By.xpath("(//div[@class=\"_1AtVbE col-12-12\"]//div[@class=\"_30jeq3 _1_WHN1\"])[1]")).getText();
		System.out.println(price);
		driver.quit();
	}
}
