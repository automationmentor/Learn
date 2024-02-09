package coreJava;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.testng.annotations.*;

import static org.testng.Assert.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


//import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestWebDriverWithTestNG {

	private WebDriver driver;
	  private String baseUrl;
	  
	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/apple/chromedriver");
		driver = new ChromeDriver();  
	    baseUrl = "http://localhost:8080/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println("Running before class method");
	  }

	  @Test
	  public void test1() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.id("j_username")).sendKeys("admin");
	    driver.findElement(By.name("j_password")).sendKeys("admin");
	    driver.findElement(By.name("Submit")).click();
	    
//	    driver.navigate().back();
//	    Assert.assertEquals("Apache Tomcat/7.0.42",driver.getTitle());
	  }

//	  @Test
//	  public void test2() throws Exception {
//	    driver.get(baseUrl + "/");
//	    driver.findElement(By.linkText("Documentation")).click();
//	    driver.navigate().back();
//	    Assert.assertEquals("Apache Tomcat/7.0.42",driver.getTitle());
//	  }
	  
	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
		  System.out.println("running after class method");
	    driver.quit();	    
	  }
	  
	}