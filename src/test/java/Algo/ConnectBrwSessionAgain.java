package Algo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.By;
import java.util.Map;
import java.util.concurrent.TimeUnit;
public class ConnectBrwSessionAgain{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		ChromeOptions o = new ChromeOptions();
		o.setExperimentalOption("debuggerAddress", "localhost:53879");
		WebDriver driver = new ChromeDriver(o);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
	    WebElement l=driver.findElement(By.id("gsc-i-id1"));
	    l.sendKeys("Testing");
	}
			   
	
}