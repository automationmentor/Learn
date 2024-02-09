package Algo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testSeleniumChrome {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "D:\\ConduentAutomation\\apache-groovy-binary-3.0.7\\groovy-3.0.7\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 30);	
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.google.com");	
        Thread.sleep(1000);
        driver.manage().window().maximize();		
        driver.findElement(By.name("q")).sendKeys("restAssured");
        Thread.sleep(1000);
        driver.close();	
	}// end of main method
}// end of class
