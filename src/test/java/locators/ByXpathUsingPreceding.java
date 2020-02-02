package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByXpathUsingPreceding extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/tables");
		Thread.sleep(2000);

		String xpath = "//table[@id='table1']/tbody/tr/td[4][contains(text(),'$100.00')]//preceding::td[1]";
		
		WebElement lname = driver.findElement(
				By.xpath(xpath));
		
		System.out.println("Last name "+lname.getText());
		Thread.sleep(2000);

	}

}
