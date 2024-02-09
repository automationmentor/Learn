package stepDefinition.Dweb;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.WebDriverManager;
import pageObjects.Dweb.*;


public class Login_Test{
	// object declaration
	public pgLogin myLoginPg;
	public pgHome myhomePg;
	public WebDriver driver;
	
	// Positive Scenario
	
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		driver=new WebDriverManager().getDriver();
		myLoginPg=new pgLogin(driver);	
		assertTrue("Assertion Failed: Title of Login Page",driver.getTitle().equals("CSF DesignerWeb Login"));
	}
	
	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String username, String password) throws Throwable {		
		myhomePg=myLoginPg.enter_valid_username_password(username, password);		
		assertTrue("Assertion Failed in signOut method: Title of Home Page",driver.getTitle().equals("CSF DesignerWeb Home"));			
	}	

		
	@Then("^User reaches to Home Page$")
	public void user_reaches_to_Home_Page() throws Throwable {
	    assertTrue("Assertion Failed: Title of Home Page",driver.getTitle().equals("CSF DesignerWeb Home"));	    
	}	
	
	@Then("^User successfully Logs Out$")
	public void user_successfully_Logs_Out() throws Throwable {
		myhomePg.signOut();
		assertTrue("Assertion Failed: Title of Login Page",driver.getTitle().equals("CSF DesignerWeb Login"));	
	}		

	
	// Negative Scenario
	@When("^User enters invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_invalid_and(String username, String password) throws Throwable {
			myLoginPg.enter_invalid_username_password(username, password);
			assertTrue("Assertion Failed: Title of Login Page",driver.getTitle().equals("CSF DesignerWeb Login"));			
		}	
	@Then("^User gets error message$")
	public void user_gets_error_message() throws Throwable {	
		assertTrue("Assertion Failed in invalid user login",myLoginPg.getInvalidLoginErrorMessage().equals("Invalid login: Please try again."));
		assertTrue("Assertion Failed: Title of Login Page",driver.getTitle().equals("CSF DesignerWeb Login"));		
	}
	
	

}
