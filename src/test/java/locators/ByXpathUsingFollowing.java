package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByXpathUsingFollowing extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);

		String xpath = "//table[@class='dataTable']/tbody/tr/td/a[contains(text(),'COMPANY')]//following::td[3]".replace("COMPANY", "UCO");
		
		WebElement currentPrice = driver.findElement(
				By.xpath(xpath));
		
		System.out.println("Current price "+currentPrice.getText());
		Thread.sleep(2000);

	}

}
