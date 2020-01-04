package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testNG.Browser;

public class SoftAssertionExample extends Browser{
	
	
	@Test
	public void test1() {
		System.out.println("Starting....");
		String pageTitle = driver.getTitle();
		
		System.out.println("Page Title "+pageTitle);
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(pageTitle, "www.amoasdf.com", "Title mis match!");
		
	//	Assert.assertEquals(pageTitle, "Sample Store","Title mis match!");
		System.out.println("Ending....");
		sf.assertAll();
	}
	

}
