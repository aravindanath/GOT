package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import browsers.LaunchBrowserUsingWebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hari_LocatorsAssgnmt extends LaunchBrowserUsingWebDriverManager{

	

	@BeforeTest
	public void setup() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("--incognito");
		ops.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(ops);
	}
	
	
	@Test
	public void notification() throws InterruptedException {
		
		driver.get("https://www.guru99.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println("Hari_LocatorsAssgnmt.listOfLinks()" + links);
		System.out.println("Number of links" +links.size());
		for(WebElement ref : links)
		{
			System.out.println("the links are :"+ ref.getAttribute("href"));
		}
				
	}

	

}
