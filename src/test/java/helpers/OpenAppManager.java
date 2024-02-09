package helpers;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import helpers.ConfigurationManager;




import org.apache.log4j.Logger;
// This class is used to open the application page in browser
public class OpenAppManager extends Thread{
    private static WebDriver driver;
    private static Logger log;

    public OpenAppManager()
    {
    	
    	try
    	{
    		driver=new WebDriverManager().getDriver();
    		log = new LoggerManager().getLogger();        	
        	String URL=new ConfigurationManager().getProperty("appUrl");
        	log.info("Inside OpenApp class:OpenAPP()");
        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    		driver.get(URL);
    		driver.manage().window().maximize();
    		log.debug("URL opened:"+URL);		
    	}
    	catch(Exception e)
    	{
    		log.error("Error in opening the URL in OpenApp class:"+e.getMessage());
    	}
    }   
    
    public OpenAppManager(String ApplicationURL)
    {
    	
    	
    	try
    	{
    		driver=new WebDriverManager().getDriver();
        	log = new LoggerManager().getLogger();        	      
        	String URL=new ConfigurationManager().getProperty(ApplicationURL);
        	log.info("Inside OpenApp class:OpenAPP(String ApplicationURL)");
        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    		driver.get(URL);     			
    		driver.manage().window().maximize();
    		log.debug("URL opened:"+URL);		
    	}
    	catch(Exception e)
    	{
    		
    		log.error("Error in OpenApp(String ApplicationURL)");
    		
    	}
    }   

}
 
    
