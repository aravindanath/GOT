package testNG;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ReadXlsUsingDataProvider  {
	WebDriver driver;
	
	public static ExcelReader xls = null;
	
	@Test(dataProvider="testData")
	public void login(Hashtable<String, String> data) throws InterruptedException {
		driver.get("https://www.myntra.com/login");
		
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data.get("user"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get("password"));
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[2]/button")).click();
 
		
		
	}
	
	
	@DataProvider
	public Object[][] testData(){
		if (xls == null) {
			xls = new ExcelReader("//Users//aravindanathdm//Documents//class//DataproviderDemo.xlsx");
		}
		String sheetName ="Login";
		int rows = xls.getRowCount(sheetName);
		int cols =  xls.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows - 1][1];

		Hashtable<String, String> table = null;
		// 2 is becoz we are reading from 2nd row
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			// for every row we need to create a hash table
			table = new Hashtable<String, String>();

			// from 1st col so o
			for (int colNum = 0; colNum < cols; colNum++) {

				// this line will create a hashtable based on key n value
				table.put(xls.getCellData(sheetName, colNum, 1), xls.getCellData(sheetName, colNum, rowNum));
				// Data will be passed in 2D array.
				data[rowNum - 2][0] = table;
			}
		}
		return data;
		
	 
		
	}

	
	
	

}
