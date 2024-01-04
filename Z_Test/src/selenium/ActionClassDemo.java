package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

public class ActionClassDemo 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\javaprogram\\\\Z_Test\\\\browser4\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement btn = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		Actions act=new Actions(driver);
		File src1 = btn.getScreenshotAs(OutputType.FILE);
		File dest2=new File("C:\\javaprogram\\Z_Test\\Images\\photo2.jpg");
		FileHandler.copy(src1, dest2);
		act.click(btn).perform();
		driver.navigate().back();
		WebElement btn2 = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		act.click(btn2).perform();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\javaprogram\\Z_Test\\Images\\photo.jpg");
		FileHandler.copy(src, dest);
		//driver.quit();
		
		driver.quit();
	}

}
