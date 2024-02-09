package coreJava;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWaitDEmo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		String workingDir = System.getProperty("user.dir");
		driver.get(workingDir + "\\fluentWaitCommandDemoPage.html");

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofSeconds(30));
		wait.withTimeout(Duration.ofSeconds(30));

		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver arg0) {
				WebElement element = arg0.findElement(By.id("dynamicColor"));
				String color = element.getCssValue("color");
				System.out.println("The button text has color :" + color);
				if (color.equals("rgba(255, 255, 0, 1)")) {
					return true;
				}
				return false;
			}
		};

		wait.until(function);
	}
}