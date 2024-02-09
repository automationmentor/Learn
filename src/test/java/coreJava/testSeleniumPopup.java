package coreJava;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.security.Credentials;
//import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class testSeleniumPopup {
	
	public static void main(String args[])
	{
	
	WebDriver driver=new FirefoxDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://localhost:8080/");	
//	driver.findElement(By.linkText("Documentation")).click();
//	driver.navigate().back();
//	driver.findElement(By.xpath("//*[@id='actions']/div[1]/a/span")).click();  
//	driver.get("http://admin:admin@localhost:8080/manager/html");	
//	driver.navigate().to("http://admin:admin@localhost:8080/manager/html");
//	Credentials c=new Credentials("","");
	List <WebElement> link = driver.findElements(By.tagName("a")); 
	System.out.println(link.size()); 

	
	
    driver.quit();    
	}
	

}

