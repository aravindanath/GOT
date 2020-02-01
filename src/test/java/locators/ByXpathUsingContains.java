package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByXpathUsingContains extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[contains(text(),'Tod')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Appliances')]")).click();
		Thread.sleep(5000);
		
		List<WebElement>deal =driver.findElements(By.xpath("//div[@id='widgetContent']/div"));
		
		System.out.println("Total no of deals "+ deal.size());
		Thread.sleep(2000);
		deal.get(10).click();
		Thread.sleep(2000);
//		for(WebElement ele : deal) {
//			System.out.println(ele.);
//		}

	}

}
