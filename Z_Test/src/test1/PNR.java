package test1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PNR 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\javaprogram\\Z_Test\\Browser22\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.confirmtkt.com/pnr-status");
		WebElement inp = driver.findElement(By.xpath("//input[@name=\"pnr\"]"));
		inp.sendKeys("6429016488");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		File SRC = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DEST=new File("C:\\javaprogram\\Z_Test\\Images\\result.jpg");
		FileHandler.copy(SRC, DEST);
	}
}
