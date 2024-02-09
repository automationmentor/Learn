package helpers;

import org.apache.log4j.Logger;
//This class is used to make only one instance of Logger object using singleton pattern 
public class LoggerManager extends Thread{
    private static Logger log;

    public LoggerManager()
    {
    	try
    	{
    	initialize();
    	}
    	catch (Exception e) 
	      {
	            log.error("Error in IntuitionLogger constructor:"+e.getMessage());	            
	      }
    }
    
    public void initialize()
    {
    	try
    	{
    		if (log == null)
        		createNewLoggerInstance();
    	}
    	catch (Exception e) 
	     {
	            log.error("Error in IntuitionLogger initialize method:"+e.getMessage());	            
	     }
    	
    }
    
    private void createNewLoggerInstance()
    {
    	try{
    		
    	  	log = Logger.getLogger("devpinoyLogger");
    	}
    	catch (Exception e) 
	     {
	            log.error("Error in IntuitionLogger createNewLoggerInstance method:"+e.getMessage());	            
	     }
    }
    
    public void destroyLogger() {
    	log = null;
    	}
    
    public Logger getLogger()
    {
    	return log;
    }
    
}
 
    
