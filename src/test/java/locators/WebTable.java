package locators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class WebTable extends LaunchBrowserUsingWebDriverManager {
//
	@Test
	public void absXpath() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);

		ArrayList<String> val = new ArrayList<String>();
		List<WebElement> currentPrice =  driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
 
		for(WebElement ele : currentPrice) {
			System.out.println(ele.getText());
			val.add(ele.getText());
		}
		System.out.println("Before sort: "+ val);
		Collections.sort(val);
		System.out.println("After sort: " +val);
		
		
		Thread.sleep(2000);

	}

}
