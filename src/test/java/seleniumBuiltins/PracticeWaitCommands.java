package seleniumBuiltins;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeWaitCommands {

	// Steps
	/*
	 * 1) Launch new Browser
	 * 
	 * 2) Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
	 * 
	 * 3) Click on the Button “Timing Alert”
	 * 
	 * 4) Accept the Alert (Alert will take 3 second to get displayed, Use
	 * WebDriverWait to wait for it)
	 * 
	 * 
	 */

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Firefox driver

		System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/Aravinda/chromedriver");
		driver = new ChromeDriver();

		// Put an Implicit wait, this means that any search for elements on the page
		// could take the time the implicit wait is set for before throwing exception
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Thread.sleep(2000);

		// Launch the URL
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		// driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

		// Click on the Button "Timing Alert"

		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();

		System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");

		// Create new WebDriver wait
		 WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement ele = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		// Wait for Alert to be present
	 	Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
	//	Alert myAlert  =  driver.switchTo().alert();
		System.out.println("Either Pop Up is displayed or it is Timed Out");

		// Accept the Alert
	//	Thread.sleep(2000);
	//	myAlert.accept();

		System.out.println("Alert Accepted");

	}

}
