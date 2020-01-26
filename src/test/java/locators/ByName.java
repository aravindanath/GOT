package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByName  extends LaunchBrowserUsingWebDriverManager{

	
	@Test
	public void search() throws InterruptedException {
		
		driver.get("https://www.google.in");
		
		
		driver.findElement(By.name("q")).sendKeys("Delhi republic day cel",Keys.ENTER);
		Thread.sleep(2000);
	}
}
