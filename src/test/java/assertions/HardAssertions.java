package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

import testNG.Browser;

public class HardAssertions extends Browser{
	
	
	@Test
	public void test1() {
		System.out.println("Starting....");
		String pageTitle = driver.getTitle();
		
		System.out.println("Page Title "+pageTitle);
		
		Assert.assertEquals(pageTitle, "Sample Store","Title mis match!");
		System.out.println("Ending....");
	}
	

}
