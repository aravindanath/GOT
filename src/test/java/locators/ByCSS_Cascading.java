package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByCSS_Cascading extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.icicibank.com/");
		driver.findElement(By.cssSelector("a.btn.inline-btn.newUser")).click();
		Thread.sleep(2000);
//		input.inputtext._58mg._5dba._2ph-#u_0_m
	}

}
