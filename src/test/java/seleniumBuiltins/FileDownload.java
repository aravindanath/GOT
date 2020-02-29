package seleniumBuiltins;

import java.util.HashMap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

public class FileDownload {
	 
		static WebDriver driver;
		@Test
		public   void fileUpload() throws InterruptedException {

			 
		       String downloadFilepath = "/Users/aravindanathdm";

		       HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		       chromePrefs.put("download.default_directory", downloadFilepath);
		       ChromeOptions options = new ChromeOptions();

		       options.setExperimentalOption("prefs", chromePrefs);
//		       options.addArguments("--test-type");
		       options.addArguments("--disable-extensions");

				WebDriverManager.chromedriver().setup();
		       driver = new ChromeDriver(options);  

		       
		       driver.get("http://the-internet.herokuapp.com/");
		       
		       driver.findElement(By.linkText("File Download")).click();
		       Thread.sleep(2000);
		       
		       driver.findElement(By.linkText("Agenda.txt")).click();


			Thread.sleep(2000);
		               driver.quit();
		}
	}
 
