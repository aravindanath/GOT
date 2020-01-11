package testNG;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataFromExcelUsingHashTable {
	public static ExcelReader xls = null;
	WebDriver driver;

	@Test(dataProvider = "getData")
	public void userDetails(Hashtable<String, String> data) {
		Reporter.log("Test Start");
		System.out.println("User :" + data.get("Name"));
		System.out.println("Age :" + data.get("Age"));
		System.out.println("Address :" + data.get("Address"));
		System.out.println("Company :" + data.get("Company"));
		Reporter.log("Test End");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"))
				.sendKeys(data.get("Name"));

	}

	@DataProvider
	public Object[][] getData() {
		if (xls == null) {
			xls = new ExcelReader("//Users//aravindanathdm//Documents//class//TestData.xlsx");

		}
		String sheetName = "UserDate";
		// This will get the row count in the sheet Login
		int rows = xls.getRowCount(sheetName);
		// This will get the col count in the sheet Login
		int cols = xls.getColumnCount(sheetName);
		// We are not getting data from 1st row hence row -1
		// We are not passing any parm in userDetails method insted we are using
		// hashtable
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
