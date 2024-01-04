package javaPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Z_Test\\Browser22\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		WebElement srcBox = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		srcBox.click();
		srcBox.sendKeys("RedmiNote 9 pro");
		srcBox.sendKeys(Keys.ARROW_DOWN);
		srcBox.sendKeys(Keys.ENTER);
		String txt = driver.findElement(By.xpath("(//div[@class=\"_2kHMtA\"]//div)[19]")).getText();
		System.out.println(txt);
	}
}
