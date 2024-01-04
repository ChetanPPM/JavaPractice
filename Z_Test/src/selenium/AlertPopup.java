package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\javaprogram\\\\Z_Test\\\\browser4\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@name=\"alertbox\"]")).click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		String msg = alt.getText();
		Thread.sleep(1000);
		alt.accept();
		System.out.println(msg);
		
		
	}
}
