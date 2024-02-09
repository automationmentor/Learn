package pageObjects.Tomcat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import helpers.PageObject;

import helpers.ObjectMapManager;

public class pgTomcat extends PageObject{
	
	@FindBy(id = "nav-hosts")
	public WebElement hosts;
	
	@FindBy(id = "nav-config")
	public WebElement config;
	
	@FindBy(linkText = "Tomcat Setup")
	public WebElement setup;
	
	@FindBy(linkText = "First Web Application")
	public WebElement FirstWebApplication;	

	@FindBy(linkText = "JDBC DataSources")
	public WebElement JDBCDataSources;	

	
	public pgTomcat(WebDriver driver) throws Exception
	{
		super(driver);			
	}	
}
