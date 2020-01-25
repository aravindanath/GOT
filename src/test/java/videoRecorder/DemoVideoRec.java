package videoRecorder;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import testNG.Browser;

public class DemoVideoRec extends Browser {

	ATUTestRecorder recorder;
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
	Date d =  new Date();

	@Test
	public void demo() throws ATUTestRecorderException {
 

		recorder = new ATUTestRecorder(System.getProperty("user.dir") + File.separator + "test-output" + File.separator,
				"TestVideo-"+dateFormat.format(d), true);
		// To start video recording.
		recorder.start();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mens wrist watch", Keys.ENTER);

		driver.findElement(By.xpath(
				"//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div/span/a/div/img"))
				.click();
		driver.get("https://www.google.in");
		driver.findElement(By.name("q")).sendKeys("i pad pro", Keys.ENTER);
		recorder.stop();
	}

 

}
