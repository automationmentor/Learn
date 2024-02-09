package Algo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class testOutsystemsSelenium {
	
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 30);	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Open web application
        driver.get("https://harsh-agnihotri.outsystemscloud.com/Tellus_TestApplication/Home.aspx?_ts=637157247855181387");			
        
        // maximize the window
        driver.manage().window().maximize();	
        
        // Login Action
        driver.findElement(By.cssSelector("#RichWidgets_wt35_block_wtMainContent_wtUserNameInput")).sendKeys("harsh.agnihotri@birlasoft.com");
        driver.findElement(By.cssSelector("#RichWidgets_wt35_block_wtMainContent_wtPasswordInput")).sendKeys("hatras78");
        driver.findElement(By.cssSelector("#RichWidgets_wt35_block_wtMainContent_wtLoginButton")).click();
        wait.until(ExpectedConditions.titleIs("Customers"));
        
        // Create new Customer
        driver.findElement(By.linkText("Create a new Customer")).click();
        driver.findElement(By.cssSelector("#RichWidgets_wt13_block_wtMainContent_wtCustomer_FullName")).sendKeys("Harsh Agnihotri");
        driver.findElement(By.cssSelector("#RichWidgets_wt13_block_wtMainContent_wtCustomer_Email")).sendKeys("harsh.agnihotri@birlasoft.com");
        driver.findElement(By.cssSelector("#RichWidgets_wt13_block_wtMainContent_wtMale")).click();
        driver.findElement(By.cssSelector("#RichWidgets_wt13_block_wtMainContent_wtCustomer_Birthday")).sendKeys("1978-07-27");
        Select selectByVisibleText = new Select (driver.findElement(By.cssSelector("#RichWidgets_wt13_block_wtMainContent_wtCustomer_ShirtSize")));
        selectByVisibleText.selectByVisibleText("2XL");
        driver.findElement(By.cssSelector("#RichWidgets_wt13_block_wtMainContent_wtCustomer_Country")).sendKeys("India");
        driver.findElement(By.cssSelector("#RichWidgets_wt13_block_wtMainContent_wt32")).click();
        
        // verify that customer is created
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wt2_wtSanitizedHtml3"))));        
        String customerCreated=driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wt2_wtSanitizedHtml3")).getText();
        Assert.assertEquals(customerCreated, "Customer 'Harsh Agnihotri' was successfully created.");
        
        // Search the customer
        driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wtMainContent_wtSearchInput")).sendKeys("Harsh Agnihotri");
        driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wtMainContent_wt19")).click();
        Thread.sleep(2000);
        
        // Select the customer
        driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wtMainContent_wtCustomerTable_ctl03_wt29")).click();
        Thread.sleep(2000);
        
        // Edit the customer 
        driver.findElement(By.cssSelector("#RichWidgets_wt13_block_wtMainContent_wtCustomer_Country")).sendKeys("UK");
        
        // Save the data
        driver.findElement(By.cssSelector("#RichWidgets_wt13_block_wtMainContent_wt32")).click();
        Thread.sleep(2000);
        // Verify if data is saved
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wt2_wtSanitizedHtml3"))));        
        String customerEdited=driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wt2_wtSanitizedHtml3")).getText();
        Assert.assertEquals(customerEdited, "Customer 'Harsh Agnihotri' was successfully updated.");
        
        // Delete the customer data
        driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wtMainContent_wtSearchInput")).clear();
        driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wtMainContent_wtSearchInput")).sendKeys("Harsh Agnihotri");
        driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wtMainContent_wt19")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wtMainContent_wtCustomerTable_ctl03_wt29")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#RichWidgets_wt13_block_wtMainContent_wt53")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wt2_wtSanitizedHtml3"))));        
        String customerDeleted=driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wt2_wtSanitizedHtml3")).getText();
        Assert.assertEquals(customerDeleted, "The customer was successfully deleted.");
        
       
        // Logout Action
        driver.findElement(By.cssSelector("#RichWidgets_wt55_block_wtHeader_wt43_wt6_wtLogoutLink")).click(); 
        wait.until(ExpectedConditions.titleIs("Login"));
        
        // close browser
        driver.close();	
	}// end of main method
}// end of class
