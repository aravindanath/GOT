package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openChrome {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/Aravinda/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
