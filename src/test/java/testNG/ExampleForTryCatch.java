package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExampleForTryCatch  extends Browser{
	
	@Test
	public void trycatch() {
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
	}

}
