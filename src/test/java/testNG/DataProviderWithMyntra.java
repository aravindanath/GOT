package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderWithMyntra {
	WebDriver driver;
	String url = "https://www.myntra.com/login";
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();

	}

	@Test(dataProvider = "data")
	public void myntra(String email, String password) throws InterruptedException {
		if(driver.getCurrentUrl().equals("https://www.myntra.com/")) {
			driver.get(url);
		}
		WebElement emailID =driver.findElement(By.xpath("//input[@type='email']"));
		WebElement pw =driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login =  driver.findElement(By.xpath("//button[text()='Log in']"));
		Assert.assertEquals(login.isDisplayed(), true,"User is logged in!");
		SoftAssert sf =  new SoftAssert();
		sf.assertEquals(login.isDisplayed(), true,"User is logged in!");

		
	
		emailID.clear();
		pw.clear();
		emailID.sendKeys(email);
		pw.sendKeys(password,Keys.ENTER);
		Thread.sleep(5000);
		sf.assertAll();

	}
	
	@DataProvider
	public Object[][] data() {
									//Rows //cols
		Object[][] data = new Object[8][2];
		data[0][0] = "aravinw@myntra.com";
		data[0][1] = "myntra@123";
		data[1][0] = "aravind@gmail.com";
		data[1][1] = "aravind";
		data[2][0] = "lekya@myntra.com";
		data[2][1] = "myntra#123";
		data[3][0] = "prince@myntra.com";
		data[3][1] = "myntra#123";
		data[4][0] = "leyana@myntra.com";
		data[4][1] = "myntra#123";
		data[5][0] = "priyanka@myntra.com";
		data[5][1] = "myntra#123";
		data[6][0] = "aravind@gmail.com";
		data[6][1] = "aravind";
		data[7][0] = "padmini@myntra.com";
		data[7][1] = "myntra#123";
		return data;
		
	}

	@AfterTest
	public void close() {
		driver.close();
	}

}
