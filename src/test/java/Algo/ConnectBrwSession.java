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
public class ConnectBrwSession{

	public static void main(String[] args) throws InterruptedException
	{
//		https://www.tutorialspoint.com/how-to-connect-to-an-already-open-browser-using-selenium-webdriver
			
//		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		ChromeOptions o = new ChromeOptions();
//		Capabilities c = ((HasCapabilities) driver).getCapabilities();
//		Map<String, Object> m = c.asMap();
//		m.forEach((key,value)->{ System.out.println("Key is: "+key+ "  Value is: "+value);});
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	    driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
//	    WebElement l=driver.findElement(By.id("gsc-i-id1"));
//	    l.sendKeys("selenium");
	    
	    System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
	    ChromeOptions o = new ChromeOptions();
		o.setExperimentalOption("debuggerAddress", "localhost:52632");
		WebDriver driver = new ChromeDriver(o);
		
		Capabilities c = ((HasCapabilities) driver).getCapabilities();
		System.out.println(c.getCapability("goog:chromeOptions"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	    driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
//	    WebElement l=driver.findElement(By.id("gsc-i-id1"));
//	    l.sendKeys("Testing new");
	    driver.findElement(By.xpath("//body[1]/header[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Advanced Excel Charts')]")).click();
	}
			   
	
}