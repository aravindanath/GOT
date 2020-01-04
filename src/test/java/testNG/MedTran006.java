package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class MedTran006 {

	/**
	 * Verify Buy now button
	 * 
	 */
	
	

	@Test 
	public void m1() {
		System.out.println("Method 1");
		Assert.fail("Fail this test");
	}

	@Test(dependsOnMethods="m1",alwaysRun=true)
	public void m2() {
		System.out.println("Method 2");
	}
	@Test(dependsOnMethods="m1",alwaysRun=true)
	public void m3() {
		System.out.println("Method 3");
	}

}
