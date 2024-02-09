package Algo;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testSeleniumJunit {
	
		static WebDriver driver;
		static WebDriverWait wait;
		
		@BeforeClass
		public static void setup()
		{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		wait= new WebDriverWait(driver, Duration.ofSeconds(30));	
		}
    	
		@Before
		public void beforeEveryTest()
		{
			driver.get("http://localhost:8080");			
	        driver.manage().window().maximize();	    
		}
		
		@Test
		public void firstTest()
		{    		
        driver.findElement(By.id("j_username")).sendKeys("admin");
        driver.findElement(By.name("j_password")).sendKeys("admin");
        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.xpath("//h1[contains(text(),'Welcome to Jenkins!')]"));
        wait.until(ExpectedConditions.titleIs("Dashboard [Jenkins]"));
        assertEquals(driver.getTitle(),"Dashboard [Jenkins]");
        driver.findElement(By.linkText("log out")).click();
        wait.until(ExpectedConditions.titleIs("Sign in [Jenkins]")); 
        assertEquals(driver.getTitle(),"Sign in [Jenkins]");
		}
		
		@Test
		public void SecondTest()
		{    		
        driver.findElement(By.id("j_username")).sendKeys("admin");
        driver.findElement(By.name("j_password")).sendKeys("test");
        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.xpath("//div[@class='app-sign-in-register__error']"));
        assertEquals(driver.findElement(By.xpath("//div[@class='app-sign-in-register__error']")).getText(),"Invalid username or password");
        }
        
		@AfterClass
		public static void tearDown()
		{
			driver.close();	
		}
        
        
    	
		
		
	

}// end of class
