package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public WebDriver driver;

	// @BeforeSuite
	@BeforeClass
	public void launchBrowser() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(ops);

		System.out.println("Open URL");
		// driver.get("https://demo.midtrans.com/");
		driver.manage().window().fullscreen();
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
