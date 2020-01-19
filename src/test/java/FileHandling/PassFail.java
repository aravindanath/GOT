package FileHandling;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testNG.Browser;

public class PassFail extends Browser {

	 public Xls_Reader xls;
	 public String sheetName = "Control";
	 public SoftAssert sf;
	 
	@Test
	public void test() {
		String path = System.getProperty("user.dir") +File.separator+"TestData"+File.separator+"TestData.xlsx";
		 
		    xls = new Xls_Reader(path);
		 
		try {
			System.out.println(path);
			driver.get("https://www.google.com");
			String title = driver.getTitle();
			sf.assertEquals(title, "google");
			xls.setCellData(sheetName, "Runmode", 2, "PASS");
			sf.assertAll();
		} catch (Exception e) {
			System.out.println("i am in catch");
			xls.setCellData(sheetName, "Runmode", 2, "FAIL");

		}
	}

	//@AfterTest//
	public void result() {
		xls.setCellData(sheetName, "Runmode", 2, "FAIL");
	}
	
}
