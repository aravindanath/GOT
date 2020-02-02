package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByCSSWithAtributes extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[type='text'][name='firstname']")).sendKeys("Arvind");
		Thread.sleep(2000);
	}

}
