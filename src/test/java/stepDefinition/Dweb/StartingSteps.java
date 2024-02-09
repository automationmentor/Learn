package stepDefinition.Dweb;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.WebDriverManager;
import helpers.LoggerManager;
import helpers.OpenAppManager;
import helpers.ConfigurationManager;

public class StartingSteps {
	
	private static Logger log;
	private static WebDriver driver;
	
	@Before
	public void beforeScenario(Scenario scenario)
	{
		try{
			log=new LoggerManager().getLogger();
			log.info("***************************************************Start**********************************************************************");
//			// load the configuration file
//			new ConfigurationManager();						
//			driver=new WebDriverManager().getDriver();
			new OpenAppManager("DwebUrl");

		}
    	catch (Exception e) 
	     {
	            log.error("Error in StartingSteps beforeScenario:"+e.getMessage());	            
	     } 
	
	}
	
	@After
	public void afterScenario(Scenario scenario) throws Exception
	{
	    if(scenario.isFailed()) 
        {
        	try
        	{	
        	log.debug("Scenario Failed and screenshot captured:"+scenario.getName());	
        	scenario.write("Current Page URL is " + driver.getCurrentUrl());
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            log.error("Scenario:"+scenario.getName()+","+scenario.getStatus());
            }
        	catch (WebDriverException somePlatformsDontSupportScreenshots)
        	{
            log.error(somePlatformsDontSupportScreenshots.getMessage());	            
            log.error("Error in creating screenshot:"+scenario.getName());
            }        		        
        }
        log.debug("Scenario:"+scenario.getName()+","+scenario.getStatus());

        WebDriverManager.destroyDriver();
	log.info("***************************************************End**********************************************************************");
	}	

}
