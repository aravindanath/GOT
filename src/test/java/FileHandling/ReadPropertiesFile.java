package FileHandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ReUsables.BaseClass;
import testNG.Browser;

public class ReadPropertiesFile extends Browser {

	@BeforeMethod
	public void setup() throws Exception {

		driver.get(BaseClass.getValue("devurl"));

	}

	@Test
	public void search() throws IOException {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(BaseClass.getValue("search"), Keys.ENTER);
	}

}
