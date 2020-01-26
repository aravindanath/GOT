package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByClassName extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void search() throws InterruptedException {

		driver.get("https://www.icicibank.com/");

		driver.findElement(By.className("pl-login-ornage-box")).click();
		
		Thread.sleep(2000);
	}
}
