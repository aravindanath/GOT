package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByRelativeXpathWithANd extends LaunchBrowserUsingWebDriverManager{
	
	@Test
	public void absXpath() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text'and @name='firstname']")).sendKeys("Arvind");
		
	}
	
	

}
