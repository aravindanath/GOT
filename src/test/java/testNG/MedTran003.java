package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class MedTran003 {

	/**
	 * Verify Buy now button
	 * 
	 */
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("$$$$$$$$$$$$before Suite$$$$$$$$$$$$");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("$$$$$$$$$$$$After Suite$$$$$$$$$$$$");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("*************before Class*************");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("*************before Test*************");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("##########Before Method##########");
	}

	@Test
	public void m1() {
		System.out.println("Method 1");
	}

//	@Test
//	public void m2() {
//		System.out.println("Method 2");
//	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("*************After Method*************");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("##########After Test##########");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("*************after Class*************");
	}

}
