package browsers;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserNotification extends LaunchBrowserUsingWebDriverManager{
	
	
	@Test
	public void notification() throws InterruptedException {
		
		driver.get("https://www.icicibank.com/");
		
		driver.findElement(By.className("pl-login-ornage-box")).click();
		Thread.sleep(2000);
		
	}

}
