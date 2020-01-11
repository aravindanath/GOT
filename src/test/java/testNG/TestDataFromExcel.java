package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestDataFromExcel {
	public static ExcelReader xls = null;
	WebDriver driver;
//	@Test(dataProvider = "getData")
//	public void f(String userName, String password) {
//		System.out.println(userName +" "+ password);
//	}

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/Aravinda/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.myntra.com/login");
		// Implicitly wait, will waits dynamically
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.NANOSECONDS);
		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
		// Thread.sleep will explicitly wait till given time
	}

	@Test(dataProvider = "getData")
	public void f(String userName, String password) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[1]/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[1]/div[1]/input")).sendKeys(userName);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[1]/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[2]/button")).click();
//		
//		System.err.println("Username: " + userName);
//		System.err.println("Password: " + password);
//		System.err.println("Age: " + age);
	}

	
	
	
	@DataProvider
	public Object[][] getData() throws IOException {
		// String path = System.getProperty("user.dir")+"//Files//object.properties";
		// Properties prop = new Properties();
		// FileInputStream fis = new FileInputStream(path);
		// prop.load(fis);
		// //xlsx format
		// String excelPath = prop.getProperty("excelPath2"); 

		// If the refrence is null then it will load the excel file.
		
		if (xls == null) { 
			xls = new ExcelReader("//Users//aravindanathdm//Documents//class//TestData.xlsx");

		}//DataproviderDemo
		String sheetName = "Login";
		// This will get the row count in the sheet Login
		int rows = xls.getRowCount(sheetName);
		// This will get the col count in the sheet Login
		int cols = xls.getColumnCount(sheetName);
		// We are not getting data from 1st row hence row -1
		Object[][] data = new Object[rows - 1][cols];
		// 2 is becoz we are reading from 2nd row
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			// from 1st col so o
			for (int colNum = 0; colNum < cols; colNum++) {
				// [0][0] zero positon
				data[rowNum - 2][colNum] = xls.getCellData(sheetName, colNum, rowNum);
			}
		}
		return data;

	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
