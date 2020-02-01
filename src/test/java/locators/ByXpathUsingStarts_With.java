package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByXpathUsingStarts_With extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.google.in/");
		driver.findElement(By.xpath("//input[starts-with(@class,'gLFyf')]")).sendKeys("Appium jobs",Keys.ENTER);
		Thread.sleep(2000);
		////span[starts-with(text(),'Hello')]

	}

}
