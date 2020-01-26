package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByID  extends LaunchBrowserUsingWebDriverManager{

	
	@Test
	public void search() throws InterruptedException {
		
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipad pro");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input']")).click();
		Thread.sleep(2000);
		
	}
}
