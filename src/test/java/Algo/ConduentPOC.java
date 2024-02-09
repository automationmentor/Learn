package Algo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ConduentPOC {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ConduentAutomation\\apache-groovy-binary-3.0.7\\groovy-3.0.7\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait= new WebDriverWait(driver, 30);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
        driver.get("https://ctsgtolling-test.crm.dynamics.com/");	
        
        Thread.sleep(1000);
        driver.manage().window().maximize();
         // login action

     		
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("harsh.agnihotri@conduent.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("Hatras1978!");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@id='submitButton']")).click();
        Thread.sleep(5000);
        for(int i=0;i<=5;i++)
        {
        	if (driver.getCurrentUrl().contains("https://sts.central.conduent.com/"))
        	{
        		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("Hatras1978!");
            	Thread.sleep(1000);
            	driver.findElement(By.xpath("//span[@id='submitButton']")).click();
            	Thread.sleep(5000);
        	}
        	else
        	{
        	break;
        	}
        }
        

        driver.findElement(By.xpath("//input[@id='idBtn_Back']")).click();
        Thread.sleep(10000);
        
        // Dynamics main page
        driver.switchTo().frame("AppLandingPage");
        driver.findElement(By.xpath("//div[@title='Account Management']")).click();
        Thread.sleep(10000);
        // New Account: Summary page
        driver.findElement(By.xpath("//button[@aria-label='New']")).click();
        Thread.sleep(1000);
        // Application number
        driver.findElement(By.xpath("//input[@aria-label='Application Number']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Application Number']")).sendKeys("NY1234");
        Thread.sleep(1000);
        // Agency
        //driver.findElement(By.xpath("//input[@aria-label='Agency, Lookup']")).clear();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@aria-label='Agency, Lookup']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@aria-label='Agency, Lookup']")).sendKeys("NEW YORK STATE THRUWAY");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@data-id='vector_agencyid.fieldControl-LookupResultsDropdown_vector_agencyid_textInputBox_with_filter_new']/following::button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@aria-label='Lookup Search Results']/li[1]")).click();
        Thread.sleep(2000);
        // Last Name       
        driver.findElement(By.xpath("//input[@aria-label='Last Name']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Last Name']")).sendKeys("Automation");
        Thread.sleep(1000);
//        // First Name
        driver.findElement(By.xpath("//input[@aria-label='First Name']")).click();
        driver.findElement(By.xpath("//input[@aria-label='First Name']")).sendKeys("User");
        Thread.sleep(1000);
        //js.executeScript("window.scrollBy(0,1000)");
        
//        // Phone
        driver.findElement(By.xpath("//input[@aria-label='Mobile Phone']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Mobile Phone']")).sendKeys("2992903333");
        Thread.sleep(1000);
//        // Mailing address
        Select drpChallenge1 = new Select(driver.findElement(By.xpath("//*[@aria-label='Challenge Question #1']")));
        drpChallenge1.selectByVisibleText("Your mailing address zipcode?");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@aria-label='Answer - Challenge Question #1']")).click();
        driver.findElement(By.xpath("//*[@aria-label='Answer - Challenge Question #1']")).sendKeys("123456");
        Thread.sleep(1000);
//        // Delivery
        driver.findElement(By.xpath("//input[@aria-label='Statement Delivery Frequency, Lookup']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@aria-label='Statement Delivery Frequency, Lookup']")).sendKeys("BI-MONTHLY");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@data-id='vector_statementdeliveryfrequencyid.fieldControl-LookupResultsDropdown_vector_statementdeliveryfrequencyid_textInputBox_with_filter_new']/following::button[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//ul[@aria-label='Lookup Search Results']/li[1]")).click();
        Thread.sleep(1000);
//        // Save
        driver.findElement(By.xpath("//body/div[@id='shell-container']/div[@id='ApplicationShell']/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]/span[1]/span[2]")).click();
//       
        Thread.sleep(5000);
        driver.close();	
	}// end of main method
}// end of class
