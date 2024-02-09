package pageObjects.Dweb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import helpers.PageObject;

import helpers.ObjectMapManager;

public class pgLogin extends PageObject{
	
	@FindBy(id = "logonpage_userName")
	private WebElement username;
	
	@FindBy(id = "logonpage_userPassword")
	private WebElement password;
	
	@FindBy(id = "logonpage_buttonLogin")
	private WebElement loginBtn;
	
	@FindBy(id = "logonpage_labelMessage")
	private WebElement loginErrMsg;	

	
	public pgLogin(WebDriver driver) throws Exception
	{
		super(driver);			
	}
	
	public void setUserName(String usernameValue)
	{
		username.sendKeys(usernameValue);
	}
	
	public void setPassword(String passwordValue)
	{
		password.sendKeys(passwordValue);
	}
	
	public pgHome enter_valid_username_password(String usernameValue, String passwordValue) throws Exception
	{
		setUserName(usernameValue);
		setPassword(passwordValue);		
		loginBtn.click();
		return new pgHome(driver);
//		return pgHome.getInstance();		
	}	
	
	public void enter_invalid_username_password(String usernameValue, String passwordValue) throws Exception
	{
		setUserName(usernameValue);
		setPassword(passwordValue);		
		loginBtn.click();
	}
	
	public String getInvalidLoginErrorMessage() throws Exception	
	{
		return loginErrMsg.getText();		
		
	}
	

	
}
