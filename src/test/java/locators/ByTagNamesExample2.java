package locators;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByTagNamesExample2 extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void search() throws InterruptedException {

		driver.get("http://the-internet.herokuapp.com/javascript_alerts");

		List<WebElement> links = driver.findElements(By.tagName("button"));

		System.out.println("Total no of buttons : " + links.size());
	
		for (WebElement ref : links) {
			ref.click();
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
		}

	}
}
