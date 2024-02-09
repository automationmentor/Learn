package pageObjects.Dweb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import helpers.PageObject;

public class pgHome extends PageObject{ 

	@FindBy(id = "ctl00_ContentPlaceHolderExplorer__controlHeader_lnkLogout")
	private WebElement signOut;
	
	public pgHome(WebDriver driver) throws Exception	
	{
		super(driver);		
	}
	
	public void signOut() throws Exception
	{
		signOut.click();
		Thread.sleep(2000);	
	}
	
}

