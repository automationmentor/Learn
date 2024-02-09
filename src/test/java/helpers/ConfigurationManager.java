package helpers;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

//This Class Reads the configuration properties(browser, driver path, appurl, locators_dir) from configuration.properties file
public class ConfigurationManager extends Thread{
	public static Properties properties;
	public static Logger log;
	
	  public ConfigurationManager()
	  {

	      try {
	    	  log=new LoggerManager().getLogger();
	    	  log.info("Inside configuration class constructor: Loading configuration properties");
			  properties = new Properties();
	    	  String workingDir=System.getProperty("user.dir");		  		
	    	  FileInputStream Master = new FileInputStream(workingDir+"\\config\\configuration.properties");
		      properties.load(Master);
		      Master.close();
		      log.info("Inside configuration class constructor: Loaded configuration properties");
	          }
	      catch (Exception e) 
	      {
	            log.error("Error in configuration class constructor while loading properties properties file:"+e.getMessage());	            
	      }
	      
	      }

	   
	   public static String getProperty(String PropertyName) throws Exception {
	         //Read value using the logical name as Key
		   try
		   {
			   log.info("Inside configuration class: getProperty:Returning property for:"+PropertyName);
			   return properties.getProperty(PropertyName);
			   
		   }
		   catch(Exception e)
		   {
			   log.error("Error in configuration class getProperty method:"+e.getMessage()); 
			   return "Error";
		   }
		   
		   }
	   
	   public static void setProperty(String PropertyName, String PropertyValue) throws Exception {
	         //Read value using the logical name as Key
		   try
		   {
			   log.info("Inside configuration class: setProperty:setting property for:"+PropertyName);
			   properties.setProperty(PropertyName,PropertyValue);
			   
		   }
		   catch(Exception e)
		   {
			   log.error("Error in configuration class setProperty method:"+e.getMessage()); 			   
		   }
		   
		   }
	          
}
