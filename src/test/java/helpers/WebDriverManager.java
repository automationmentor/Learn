package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

import helpers.ConfigurationManager;


import org.apache.log4j.Logger;
// This class is used to make only one instance of WebDriver object using singleton pattern 
public class WebDriverManager extends Thread{
    private static WebDriver webDriverObject;
    private static Logger log;   
    private static ConfigurationManager conf;
    public static String browserName="chrome";

    public WebDriverManager()
    {
//    	System.out.println("inside WeDriverManager constructor");
    	try
    	{
    		log=new LoggerManager().getLogger();
    		conf=new ConfigurationManager();
        	log.info("inside IntuitionDriver:constructor: Calling initialize() method");
        	initialize();
    	}
    	catch (Exception e) 
	      {
	            log.error("Error in Intuition Driver constructor:"+e.getMessage());	            
	      }
    	

    }
    
    public void initialize()
    {
//    	System.out.println("inside WeDriverManager:initialize");
    	
    	try{
    		
    	
		    	if (webDriverObject == null)
		    	{
		    		log.info("Intuition driver is null. Initializing the driver");
		    		createNewDriverInstance();    		
		    	}
		    	else
		    	{
		    		log.info("Driver is already initialized. Use the existing instance");
		    	}
	    	}
    	catch (Exception e) 
	      {
	            log.error("Error in Intuition Driver initialize method:"+e.getMessage());	            
	      }
    }
    
   
    private void createNewDriverInstance()
    {
//    	System.out.println("inside WeDriverManager:createNewDriverInstance");
    	
    	try
    	{    		
        	String workingDir=System.getProperty("user.dir");
        	
        	String driverPath=conf.getProperty("driverPath");        	
//        	String browserType=ConfigurationManager.getProperty("browser");        	
        	String browserType=browserName;
        	log.debug("Initializing the Driver in IntuitionDriver class:createNewDriverInstance() method ");
        	
	    	switch (browserType) 
			{
			case "firefox":
				System.setProperty("webdriver.gecko.driver",workingDir+driverPath+"geckodriver.exe");
				webDriverObject = new FirefoxDriver();
				break;
			case "ie":
				System.setProperty("webdriver.ie.driver", workingDir+driverPath+"IEDriverServer.exe");			
	//			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
	//			caps.setCapability("ignoreZoomSetting", true);
	//			driver = new InternetExplorerDriver(caps);
				webDriverObject= new InternetExplorerDriver ();
				break;
			case "edge":
				System.setProperty("webdriver.edge.driver", workingDir+driverPath+"MicrosoftWebDriver.exe");			
				webDriverObject= new EdgeDriver();
				break;
			case "chrome":
				ChromeOptions options = new ChromeOptions();
				options.addArguments("chrome.switches","--disable-extensions");
				options.addArguments("disable-infobars");
				//ChromeOptions options = new ChromeOptions();
		    	options.addArguments("start-maximized");
				System.setProperty("webdriver.chrome.driver", workingDir+driverPath+"chromedriver.exe");
				//System.setProperty("webdriver.chrome.driver", "D:\\CSF-Development\\Intuition\\Main\\Automation\\Intuition8.0\\resources\\drivers\\chromedriver.exe");
				webDriverObject = new ChromeDriver(options);
				break;
				
			default:
				log.info("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");			
		} 
	    	// end of switch
    	log.info("Driver Initialized in IntuitionDriver class:createNewDriverInstance():"+browserType);
//    	System.out.println("Driver Initialized in IntuitionDriver class:createNewDriverInstance():"+browserType);
    	} //end of try
    	catch(Exception e)
    	{
    		log.error("Error in Initializing the Driver in IntuitionDriver class:createNewDriverInstance():"+e.getMessage());
    	}
    	
    	webDriverObject.manage().deleteAllCookies();
    }
    
    
    public static void destroyDriver() throws Exception
    {
    	log.info("Destroying the Intuition Driver"); 
    	webDriverObject.quit();
    	webDriverObject = null;    	

    }
    
    public static WebDriver getDriver()
    {
    	log.info("Returning the driver instance from IntuitionDriver class:getDriver()");
    	return webDriverObject;
    }
    
    
    
}
 
    
