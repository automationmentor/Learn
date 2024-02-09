package coreJava;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

// Example of webdriver with junit
public class TestWebdriverWithJunit {

	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://localhost:8080/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	  }

	  @Test
	  public void test1() throws Exception {
	    driver.get(baseUrl + "/");	    
	    driver.findElement(By.linkText("Documentation")).click();
	    driver.navigate().back();
	  }

	  @Test
	  public void test2() throws Exception {
	    driver.get(baseUrl + "/");	    
	    driver.findElement(By.linkText("Configuration")).click();
	    driver.navigate().back();
	  }
	  
	  @Test
	  public void test3() throws Exception {
	    driver.get(baseUrl + "/");	    
	    Assert.assertEquals("Apache Tomcat/7.0.42",driver.getTitle());	    
	    
	  }
	  
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();	    
	  }
	  
	}