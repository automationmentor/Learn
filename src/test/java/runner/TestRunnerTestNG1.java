package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sitture.ExtentReporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import helpers.ConfigurationManager;
import helpers.WebDriverManager;



@RunWith(Cucumber.class)   // to run test with junit
@Test(groups = "cucumber") // to run test with TestNG
@CucumberOptions(
		features = "src/test/resources/features/tomcat_links.feature"
		,glue={"stepDefinition"}
//		,plugin = {"com.sitture.ExtentFormatter:src/test/resources/reports/GUIreport.html"},monochrome =true
		)

// you need to extend the runner class with AbstractTestNGCucumberTests if you want to run with TestNG or testng.xml
public class TestRunnerTestNG1 extends AbstractTestNGCucumberTests{
	
	@BeforeClass
	@Parameters("browser")
    public static void setupBrowser(String browser) throws Exception{
		System.out.println("browser is:"+browser);
		WebDriverManager.browserName=browser;
//		DriverManager.browserName=browser;
   }
	
//	@AfterClass
//	@Parameters("browser")
//    public static void report(String browser) throws Exception{		
//		String browserType=browser;
//		ExtentReporter.setConfig("config/extent-config.xml");     
//        ExtentReporter.setSystemInfo("Browser", browserType);
//        ExtentReporter.setSystemInfo("Selenium", "v2.52.1");
//        ExtentReporter.setSystemInfo("Build", "v0.0.0.0");        
//   }

}