package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class openFirefox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.gecko.driver", "/Users/aravindanathdm/Documents/Jars/geckodriver");
		
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
