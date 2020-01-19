package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertCheck {

	protected WebDriver driver;

	SoftAssert sf1 = new SoftAssert();
	SoftAssert sf2 = new SoftAssert();

	@BeforeClass
	public void launchBrowser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		System.out.println("Open URL");
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void login() {

		WebElement unametxt = driver.findElement(By.name("userName"));
		WebElement pwdtxt = driver.findElement(By.name("password"));

		Assert.assertTrue(unametxt.isDisplayed());
		unametxt.sendKeys("besant");
		System.out.println("Username entered");
		Assert.assertTrue(pwdtxt.isDisplayed());
		pwdtxt.sendKeys("besant");
		System.out.println("Password entered");
		driver.findElement(By.name("login")).click();

	}

	@Test(priority = 2)
	public void validHomepageTitleCheck() {
		String ExpTitle = "Find a Flight: Mercury Tours:";
		sf1.assertEquals(ExpTitle, driver.getTitle());
		System.out.println("This is homepage");
		sf1.assertAll();
	}

	@Test(priority = 3)
	public void invalidHomepageTitleCheck() {
		String ExpTitle = "Mercury Tours";
		sf2.assertEquals(ExpTitle, driver.getTitle());
		System.out.println("Homepage title mismatch occured");
		sf2.assertAll();
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
