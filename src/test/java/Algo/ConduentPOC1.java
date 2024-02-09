package Algo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ConduentPOC1 {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ConduentAutomation\\apache-groovy-binary-3.0.7\\groovy-3.0.7\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
        driver.get("https://ctsgtolling-test.crm.dynamics.com/");	
        driver.manage().window().maximize();
         // login action
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("harsh.agnihotri@conduent.com");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("Hatras1978!");
        driver.findElement(By.xpath("//span[@id='submitButton']")).click();
        Thread.sleep(5000);
        for(int i=0;i<=5;i++)
        {
        	if (driver.getCurrentUrl().contains("https://sts.central.conduent.com/"))
        	{
        		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("Hatras1978!");
            	driver.findElement(By.xpath("//span[@id='submitButton']")).click();
            	Thread.sleep(5000);
        	}
        	else
        	{
        	break;
        	}
        }
        

        driver.findElement(By.xpath("//input[@id='idBtn_Back']")).click();
        
        // Dynamics main page
        driver.switchTo().frame("AppLandingPage");
        driver.findElement(By.xpath("//div[@title='Account Management']")).click();
        // New Account: Summary page
        driver.findElement(By.xpath("//button[@aria-label='New']")).click();
        // Application number
        driver.findElement(By.xpath("//input[@aria-label='Application Number']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Application Number']")).sendKeys("NY12345");
        Thread.sleep(1000);
        // Agency
        driver.findElement(By.xpath("//input[@aria-label='Agency, Lookup']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Agency, Lookup']")).sendKeys("NEW YORK STATE THRUWAY");
        driver.findElement(By.xpath("//input[@data-id='vector_agencyid.fieldControl-LookupResultsDropdown_vector_agencyid_textInputBox_with_filter_new']/following::button[1]")).click();
        driver.findElement(By.xpath("//ul[@aria-label='Lookup Search Results']/li[1]")).click();
        // Last Name       
        driver.findElement(By.xpath("//input[@aria-label='Last Name']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Last Name']")).sendKeys("Automation");
        // First Name
        driver.findElement(By.xpath("//input[@aria-label='First Name']")).click();
        driver.findElement(By.xpath("//input[@aria-label='First Name']")).sendKeys("User");
        
        // Phone
        WebElement PhoneNo=driver.findElement(By.xpath("//input[@aria-label='Mobile Phone']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", PhoneNo);
        //new Actions(driver).moveToElement(PhoneNo).click().build().perform();
        PhoneNo.click();
        PhoneNo.sendKeys("111111111");
        //driver.findElement(By.xpath("//input[@aria-label='Mobile Phone']")).click();
        //driver.findElement(By.xpath("//input[@aria-label='Mobile Phone']")).sendKeys("2992903333");
     
       // Mailing address
        Select drpChallenge1 = new Select(driver.findElement(By.xpath("//*[@aria-label='Challenge Question #1']")));
        drpChallenge1.selectByVisibleText("Your mailing address zipcode?");
        driver.findElement(By.xpath("//*[@aria-label='Answer - Challenge Question #1']")).click();
        driver.findElement(By.xpath("//*[@aria-label='Answer - Challenge Question #1']")).sendKeys("123456");
        // Delivery
        driver.findElement(By.xpath("//input[@aria-label='Statement Delivery Frequency, Lookup']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Statement Delivery Frequency, Lookup']")).sendKeys("BI-MONTHLY");
        driver.findElement(By.xpath("//input[@data-id='vector_statementdeliveryfrequencyid.fieldControl-LookupResultsDropdown_vector_statementdeliveryfrequencyid_textInputBox_with_filter_new']/following::button[1]")).click();
        driver.findElement(By.xpath("//ul[@aria-label='Lookup Search Results']/li[1]")).click();
        // Save
        //driver.findElement(By.xpath("//body/div[@id='shell-container']/div[@id='ApplicationShell']/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]/span[1]/span[2]")).click();
        Thread.sleep(5000);
        driver.close();	
	}// end of main method
}// end of class
