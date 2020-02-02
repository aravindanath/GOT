package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByXpathUsingContains2 extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in') or contains(text(),'Hello, Sign in')]")).click();
		Thread.sleep(2000);
		
		/*
		 * @text --> attribute
		 * text() --> function
		 * Contains --> partial or full value and must use , not =
		 * ex. //input[contains(@value,'Log')]
		 */
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in') or contains(text(),'Hello, Sign in')]")).click();
		Thread.sleep(2000);
		
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[contains(@type,'sub') and @value='Log In']")).click();
		Thread.sleep(2000);
	
	}

}
