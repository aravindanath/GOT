package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookHomePageTest {

	public static WebDriver driver;
	public static String url;
	public static String browser;
	public static WebElement day;
	public static WebElement month;
	public static WebElement year;

	
	@BeforeMethod
	public static void setUp() throws IOException {
		String path = System.getProperty("user.dir") + "\\TestData\\FaceBookTest.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		url = prop.getProperty("qaurl");
		System.out.println("QA URL IS " + url);
		browser = prop.getProperty("browser");
		System.out.println("Browser is " + browser);

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();

		}

		else if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("FireFox");
		}

	}

	@Test
	public void faceBookTest() throws InterruptedException {

		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"firstname\"]")).sendKeys("Adithi");
		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"lastname\"]")).sendKeys("Adhi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"u_0_r\" and @type=\"text\"]")).sendKeys("9898967895");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"password\" and @id=\"u_0_w\"]")).sendKeys("Test");
		Thread.sleep(3000);

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(day);
		select.selectByVisibleText("15");

		Select select1 = new Select(month);
		select1.selectByVisibleText("Sept");

		Select select2 = new Select(year);
		select2.selectByVisibleText("1992");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='radio']/following::label[text()='Female']")).click();
		Thread.sleep(3000);

	}

	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}

}
