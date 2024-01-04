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
import org.openqa.selenium.support.ui.Select;

public class ListBox 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\javaprogram\\\\Z_Test\\\\browser4\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		WebElement list = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select  s=new Select(list);
		s.selectByIndex(8);
		Thread.sleep(2000);
		driver.quit();
	}

}
