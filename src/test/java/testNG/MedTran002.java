package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MedTran002 extends Browser{

	/**
	 * Verify Buy now button
	 * 
	 */
	 
	 


	@Test
	public void verifyBuyNow() {

		System.out.println("verifyBuyNow");
		WebElement buynow = driver.findElement(By.xpath("//a[@class='btn buy']"));
		System.out.println("Buy button is displayed?"+buynow.isDisplayed());
		System.out.println("Buy button is Enabled?"+buynow.isEnabled());
		System.out.println("Buy button is Selected?"+buynow.isSelected());
	}

	
	

}
