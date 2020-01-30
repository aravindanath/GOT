package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByXpathUsingContains extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[contains(text(),'Tod')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Appliances')])[2]")).click();
		Thread.sleep(5000);
/*
 * @text --> attribute
 * text() --> function
 * Contains --> partial or full value and must use , not =
 * ex. //input[contains(@value,'Log')]
 */
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();
		Thread.sleep(5000);
	}

}
