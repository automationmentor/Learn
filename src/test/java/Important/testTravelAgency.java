package Important;

import java.time.Duration;
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


public class testTravelAgency {
	
	public static void main(String args[]) throws Exception
	{
		String workingDir=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", workingDir+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));	
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Open web application
        driver.get("http://blazedemo.com/");			
        
        // Maximize window
        driver.manage().window().maximize();	
        
        // verify the page
        wait.until(ExpectedConditions.titleIs("BlazeDemo"));
        Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(), "Welcome to the Simple Travel Agency!");
        
        // Choose Departure city
        
        Select selectDepartureCity = new Select (driver.findElement(By.xpath("//select[@name='fromPort']")));
        selectDepartureCity.selectByVisibleText("Paris");
        
        // Choose Destination city
        Select selectDestinationCity = new Select (driver.findElement(By.xpath("//select[@name='toPort']")));
        selectDestinationCity.selectByVisibleText("London");
        
        // Find Flights
        
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        
        // choose flight
        wait.until(ExpectedConditions.titleIs("BlazeDemo - reserve"));
        driver.findElement(By.xpath("//tr[1]//td[1]//input[1]")).click();
        
        // Enter Passenger Details
        wait.until(ExpectedConditions.titleIs("BlazeDemo Purchase"));
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("Test");
        
        Select selectCardType = new Select (driver.findElement(By.xpath("//select[@id='cardType']")));
        selectCardType.selectByVisibleText("Visa");
        
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
     
        
        wait.until(ExpectedConditions.titleIs("BlazeDemo Confirmation"));
        Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(), "Thank you for your purchase today!");
        
       
        // close browser
        driver.close();	
	}// end of main method
}// end of class
