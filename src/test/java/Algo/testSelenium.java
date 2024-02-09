package Algo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testSelenium {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 30);	
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://localhost:8080");			
        driver.manage().window().maximize();		
        driver.findElement(By.id("j_username")).sendKeys("admin");
        driver.findElement(By.name("j_password")).sendKeys("admin");
        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.xpath("//h1[contains(text(),'Welcome to Jenkins!')]"));
        wait.until(ExpectedConditions.titleIs("Dashboard [Jenkins]"));
        driver.findElement(By.linkText("log out")).click();
        wait.until(ExpectedConditions.titleIs("Sign in [Jenkins]"));
        driver.close();	
	}// end of main method
}// end of class
