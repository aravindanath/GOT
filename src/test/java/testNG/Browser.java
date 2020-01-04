package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	protected WebDriver driver;

	//@BeforeSuite
	@BeforeClass
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		System.out.println("Open URL");
		driver.get("https://demo.midtrans.com/");
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
