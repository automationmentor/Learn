package coreJava;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class SeleniumFluentWait {
	
	public static void main(String args[])
	{
	
	WebDriver driver=new FirefoxDriver();
	// implicit wait
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	// explict wait
//	WebDriverWait wait=new WebDriverWait(driver,10);
	
	driver.get("http://localhost:8080/");
	
	// fluent wait
	FluentWait wait=new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(Exception.class);
	Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
		public Boolean apply(WebDriver arg0) {
			WebElement element = arg0.findElement(By.id("dynamicColor"));
			String color = element.getCssValue("color");
			System.out.println("The button text has color :" + color);
			if (color.equals("rgba(255, 255, 0, 1)")) {
				return true;
			}
			return false;
		}
	};
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Documentation")))click();
	driver.navigate().back();
    
//	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Configuration"))).click();	
	driver.navigate().back();
    
    Assert.assertEquals("Apache Tomcat/7.0.42",driver.getTitle());
    
    driver.quit();
    
	}
	

}

