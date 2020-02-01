package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	WebDriver driver; 
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
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium jobs..",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
	}

}
