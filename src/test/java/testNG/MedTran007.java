package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class MedTran007 {

	/**
	 * Verify Buy now button
	 * 
	 */
	
	@BeforeGroups("TestCaseDemo")
	public void setupDB() {
		System.out.println("setupDB()");
	}

	@AfterGroups("TestCaseDemo")
	public void cleanDB() {
		System.out.println("cleanDB()");
	}


	@Test(groups="TestCaseDemo")
	public void m1() {
		System.out.println("Method 1");
		Assert.fail("Fail this test");
	}

	@Test(dependsOnMethods="m1",alwaysRun=true,groups="TestCase")
	public void m2() {
		System.out.println("Method 2");
	}
	@Test(dependsOnMethods="m1",alwaysRun=true,groups="TestCase")
	public void m3() {
		System.out.println("Method 3");
	}

	@Test(dependsOnGroups = { "TestCase", "TestCaseDemo" })
	public void runFinal() {
		System.out.println("runFinal");
	}
}
