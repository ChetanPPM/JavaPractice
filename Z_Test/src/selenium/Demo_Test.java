package selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_Test 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\javaprogram\\\\Z_Test\\\\browser4\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.newel.com/product/pair-of-carl-malmsten-art-deco-swedish-inlaid-\r\n" + 
				"high-back-upholstered-armchairs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"recaptchaId3\"]/iframe")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"_close\"]"))).click();
		driver.findElement(By.xpath("(//button[@class=\"cust-btn cust-inq\"])[2]")).click();
}
}