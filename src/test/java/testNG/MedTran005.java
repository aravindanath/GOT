package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MedTran005 extends Browser {

	/**
	 * Verify Buy now button
	 * 
	 */

	@Test(alwaysRun = false)
	public void verifyBuyNow() {
		int age = 100;
		if (age <= 10) {
			throw new SkipException("you are young..");
		}
		System.out.println("verifyBuyNow");
		WebElement buynow = driver.findElement(By.xpath("//a[@class='btn buy']"));
		System.out.println("Buy button is displayed?" + buynow.isDisplayed());
		System.out.println("Buy button is Enabled?" + buynow.isEnabled());
		System.out.println("Buy button is Selected?" + buynow.isSelected());

	}

}
