package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByCSSID extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("htts://www.amazon.com");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("ipad", Keys.ENTER);

	}

}
