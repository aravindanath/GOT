package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByCSS_ContainsWith extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.google.com/");
		/**
		 * ^ --> starts with
		 */
		driver.findElement(By.cssSelector("input[class*='gLF']")).sendKeys("Aravindanath selenium trainer",Keys.ENTER);
		Thread.sleep(3000);
	}

}
