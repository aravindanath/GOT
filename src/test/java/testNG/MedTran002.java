package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MedTran002 extends Browser{

	/**
	 * Verify Buy now button
	 * 
	 */
	 
	 


	@Test(enabled=true)
	public void verifyBuyNow() {
		Reporter.log("User is attempting to click on buy");
		System.out.println("verifyBuyNow");
		try {
			WebElement buynow = driver.findElement(By.xpath("//a[@class='btn buy']"));
			System.out.println("Buy button is displayed?"+buynow.isDisplayed());
			System.out.println("Buy button is Enabled?"+buynow.isEnabled());
			System.out.println("Buy button is Selected?"+buynow.isSelected());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("User failed click on buy");
		}
	}

	
	

}
