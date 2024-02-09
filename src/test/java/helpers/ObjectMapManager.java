package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectMapManager {
	public static Properties webElementProperties;
	public static ConfigurationManager configurationProperties;
	public WebDriver driver;
	public Logger log;
	public WebElement locatorObj;	
	  
	  public ObjectMapManager(WebDriver driver) throws Exception
	  {
		  
		  this.driver=driver;		  
		  configurationProperties=new ConfigurationManager();
		  webElementProperties=new Properties();
		  log = Logger.getLogger("devpinoyLogger");		  
		  
		  try {
	    	  String workingDir=System.getProperty("user.dir");		  		
	    	  String locators_dir=configurationProperties.getProperty("locators_dir");	    	  
	    	  FileInputStream locatorMaster = new FileInputStream(workingDir+locators_dir+"\\locators.properties");
	    	  webElementProperties.load(locatorMaster);
	    	  locatorMaster.close(); 
	    	  log.debug("Initialized Objectmap for locators");
	          }catch (IOException e) {
	              log.error("Error in Initializing Objectmap for locators"+e.getMessage());
	         }	  
		  
	      }

	   
	   public void processLocator(String ElementName) throws Exception {
//	         try
//	         {
		   //Read value using the logical name as Key		   
		     String locator = webElementProperties.getProperty(ElementName);
		    //Split the value which contains locator type and locator value
	         String locatorType = locator.split("#")[0];
	         String locatorValue = locator.split("#")[1];
	         //Return a instance of By class based on type of locator
	           if(locatorType.toLowerCase().equals("id"))
	        	   locatorObj=driver.findElement(By.id(locatorValue));
	           else if(locatorType.toLowerCase().equals("name"))
	        	   locatorObj= driver.findElement(By.name(locatorValue));
	           else if((locatorType.toLowerCase().equals("classname")) || (locatorType.toLowerCase().equals("class")))
	        	   locatorObj= driver.findElement(By.className(locatorValue));
	           else if((locatorType.toLowerCase().equals("tagname")) || (locatorType.toLowerCase().equals("tag")))
	        	   locatorObj= driver.findElement(By.tagName(locatorValue));
	           else if((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link")))
	        	   locatorObj= driver.findElement(By.linkText(locatorValue));
	           else if(locatorType.toLowerCase().equals("partiallinktext"))
	        	   locatorObj= driver.findElement(By.partialLinkText(locatorValue));
	           else if((locatorType.toLowerCase().equals("cssselector")) || (locatorType.toLowerCase().equals("css")))
	        	   locatorObj= driver.findElement(By.cssSelector(locatorValue));
	           else if(locatorType.toLowerCase().equals("xpath"))
	        	   locatorObj= driver.findElement(By.xpath(locatorValue));
	           else
	                   throw new Exception("Locator type '" + locatorType + "' not defined!!");
	           log.debug("processed the locator for:"+ElementName+","+locatorObj.getText());
//	         } 
//	         catch(Exception e)
//	         {
//	        	 log.error("Unable to process locator for:"+ElementName);
//	        	 log.error(e.getMessage());
//	        	 
//	         }
	         }	   
	   
	   public WebElement getLocator(String ElementName) throws Exception {
		   processLocator(ElementName);
		   return locatorObj;
	   }
	   
	   public String getXpath(String ElementType, String ElementName) throws Exception {
		   
		   String object_xpath=webElementProperties.getProperty(ElementType).split("#")[1].replace(ElementType,ElementName);
		   return object_xpath;
	   }
	   

	   
}
