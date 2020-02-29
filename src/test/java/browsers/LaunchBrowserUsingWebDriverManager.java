package browsers;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import ReUsables.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserUsingWebDriverManager {

	protected WebDriver driver;

	@BeforeClass
	public void setup() throws IOException {
		String browser = BaseClass.getValue("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			// https://sites.google.com/a/chromium.org/chromedriver/capabilities
			//https://www.guru99.com/chrome-options-desiredcapabilities.html
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--disable-notifications");
			ops.addArguments("--incognito");
			ops.setAcceptInsecureCerts(true);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(ops);
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fio = new FirefoxOptions();
			fio.setAcceptInsecureCerts(true);
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
