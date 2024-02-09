package Algo;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class JunitSample {
	
				
		@Test
		public void firstTest()
		{    		
         
        assertEquals("one","one");
		}
		
		@Test
		public void SecondTest()
		{    		
        
        assertEquals("Two","two");
        }
        

        
        
    	
	
}// end of class
