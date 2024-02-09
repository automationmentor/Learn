package helpers;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import helpers.WebDriverManager;
import helpers.LoggerManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;
//This class is the base class that every page in the application will inherit
public class PageObject {
	public static Logger log;
	public static WebDriverWait wait;
	public static Actions actions;
	public static WebDriver driver;
//	public static ObjectMap objmap;
	public static KeyInput keyboard;		
	
	public PageObject(WebDriver driver){
		try
		{
		log=new LoggerManager().getLogger();
		log.info("Inside PageObject constructor: initializing WebDriverWait, actions, logger and page WebElements");
		this.driver=driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		actions=new Actions(driver);
		//keyboard=((HasInputDevices) driver).getKeyboard();
		PageFactory.initElements(driver, this);
		log.info("Inside PageObject constructor: initialized WebDriverWait, actions, logger and page WebElements");		
		}
    	catch (Exception e) 
	     {
	            log.error("Error in PageObject class constructor:"+e.getMessage());	            
	     }
		
	}
	
	public void refresh_Page() throws Throwable {
		try
		{
		log.info("Inside PageObject:refrestPage: Refresing the page");	
		actions.keyDown(Keys.CONTROL)
		         .sendKeys(Keys.chord("R"))
		         .keyUp(Keys.CONTROL)
		         .perform();
		log.info("Inside PageObject:refrestPage: Refreshed the page");
		}
		catch(Throwable e)
		{
			log.error("Error in refreshing the page");
			throw(e);
		}	
		}

	
	public void removeMouse() throws Exception
	{
		actions.moveToElement(driver.findElement(By.xpath("/html/head/title"))).perform();
	}
	
	public void closePage()
	{
		driver.close();
	}

}
