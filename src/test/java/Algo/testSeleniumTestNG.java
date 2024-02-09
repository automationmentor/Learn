package Algo;

import java.time.Duration;

//import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import junit.framework.Assert;


public class testSeleniumTestNG {
	
		static WebDriver driver;
		static WebDriverWait wait;
		
		@BeforeClass
		public void setup()
		{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		
		}
    	
		@BeforeMethod
		public void beforeEveryTest()
		{
			driver.get("http://localhost:8080");			
	        driver.manage().window().maximize();	    
		}
		
		@Test(priority=2,invocationCount=1)
		public void validUsername()
		{    		
        driver.findElement(By.id("j_username")).sendKeys("admin");
        driver.findElement(By.name("j_password")).sendKeys("admin");
        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.xpath("//h1[contains(text(),'Welcome to Jenkins!')]"));
        wait.until(ExpectedConditions.titleIs("Dashboard [Jenkins]"));
        Assert.assertEquals(driver.getTitle(),"Dashboard [Jenkins]");
        driver.findElement(By.linkText("log out")).click();
        wait.until(ExpectedConditions.titleIs("Sign in [Jenkins]")); 
        Assert.assertEquals(driver.getTitle(),"Sign in [Jenkins]");
		}
		
		@Test(enabled=true,priority=1,retryAnalyzer = MyRetry.class)
		public void invalidUsername()
		{    		
        driver.findElement(By.id("j_username")).sendKeys("admin");
        driver.findElement(By.name("j_password")).sendKeys("test");
        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.xpath("//div[@class='app-sign-in-register__error']"));
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='app-sign-in-register__error']")).getText(),"Invalid username or password");
        }
        
		@AfterClass
		public void tearDown()
		{
			driver.close();	
		}
        
        
    	
		
		
	

}// end of class
