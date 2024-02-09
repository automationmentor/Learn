package stepDefinition.Tomcat;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.WebDriverManager;
import pageObjects.Tomcat.*;


public class TomcatTest{
	// object declaration
	public pgTomcat pgTomcatObject;
	public WebDriver driver;	
	
	@Given("^User is on tomcat Page$")
	public void user_is_on_tomcat_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions		
		driver=WebDriverManager.getDriver();
		pgTomcatObject=new pgTomcat(driver);		
	}
	

	@When("^User clicks on Documentation Page$")
	public void user_clicks_on_Documentation_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pgTomcatObject.hosts.click();		
        driver.navigate().back();        
		
	}

	@When("^User clicks on Configuration Page$")
	public void user_clicks_on_Configuration_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pgTomcatObject.config.click();		
        driver.navigate().back();
        
	}

		
	@Then("^Message displayed All Header Links Are Working$")
	public void message_displayed_All_Header_Links_Are_Working() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("All the links are working");
	    	    
	}

	// Scenario 2
	@When("^User clicks on Tomcat Setup link$")
	public void user_clicks_on_Tomcat_Setup_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pgTomcatObject.setup.click();		
		driver.navigate().back();
	    
	}

	@When("^User clicks on first Web Application link$")
	public void user_clicks_on_first_Web_Application_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pgTomcatObject.FirstWebApplication.click();		
		driver.navigate().back();
	    
	}

	@When("^User clicks on JDBC DataSources link$")
	public void user_clicks_on_JDBC_DataSources_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pgTomcatObject.JDBCDataSources.click();		
		driver.navigate().back();
	    
	}
	
	@Then("^Message displayed All Developer Links Are Working$")
	public void message_displayed_All_Developer_Links_Are_Working() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("All the Developer links are working");	    	    
	}
	
	

}
