package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MedTran001  extends Browser{

	/**
	 * Verify home page title
	 * 
//	 */
//	@BeforeTest
//	public void openBrowser() {
//
//		System.out.println("Open browser");
//
//	}

 
	@Test
	public void verifyTitle() {
		String title =driver.getTitle();
		
		Reporter.log("User is on "+ title);
		System.out.println("Page title is "+ title);
		

	}

	
	
//	
//	@AfterTest
//	public void closeBrowser() {
//
//		System.out.println("close Browser");
//
//	}

}
