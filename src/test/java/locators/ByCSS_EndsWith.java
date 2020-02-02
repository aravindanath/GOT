package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByCSS_EndsWith extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.google.com/");
		/**
		 * $ --> Ends with
		 */
		driver.findElement(By.cssSelector("input[class$='gsfi']")).sendKeys("aravindanath selenium trainer",Keys.ENTER);
		Thread.sleep(2000);
	}

}
