package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByXpathUsingFollowing2 extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/tables");
		Thread.sleep(2000);
		
		String lName = "//table[@id='table1']/tbody/tr/td[1][contains(text(),'LNAME')]//following::td[4]".replace("LNAME", "Smith");
		String website = driver
				.findElement(
						By.xpath(lName))
				.getText();
		System.out.println("WebSite " + website);

	}

}
