package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByCSS_StartsWith extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		/**
		 * ^ --> starts with
		 */
		driver.findElement(By.cssSelector("input[name^='first']")).sendKeys("Arvind");
		Thread.sleep(2000);
	}

}
