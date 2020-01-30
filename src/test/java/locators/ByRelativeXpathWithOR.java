package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByRelativeXpathWithOR extends LaunchBrowserUsingWebDriverManager{
	
	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text'and @name='lastname' or @id='u_0_o']")).sendKeys("selenium jobs",Keys.ENTER);
		Thread.sleep(2000);
	}
	
	

}
