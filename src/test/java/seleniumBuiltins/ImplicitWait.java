package seleniumBuiltins;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/Aravinda/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		waitTillElementClikable(10, ele);
		waitALertAndAccept(13);
		
		 
		 

	}

	/**
	 * 
	 * @param timeInSeconds
	 */
	public static void waitALertAndAccept(int timeInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();

	}

	public static void waitTillElementClikable(int time,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();;
		
	}
	
	
	
}
