package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByTagNames extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void search() throws InterruptedException {

		driver.get("https://www.google.in");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no of links : "+links.size());
		
		for(WebElement ref : links) {
			System.out.println(ref.getText() + " ----> "+ ref.getAttribute("href"));
		}
		

	}
}
