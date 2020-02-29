package seleniumBuiltins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testNG.Browser;

import java.net.URL;

public class CloudExcution {



        private static final String ACCESS_KEY = "eyJ4cC51Ijo2MDUxNTYyLCJ4cC5wIjo2MDUxNTYxLCJ4cC5tIjoiTVRVMU5qQXhNelEyTWpRNE9BIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4NzEzNzM0NjQsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.8crRVS6W13ABOJVGkLj9oQXVWPKBqOxakgKX_ECqC50";
        private RemoteWebDriver driver;
        private URL url;
        private DesiredCapabilities dc = new DesiredCapabilities();

        @BeforeMethod
        public void setUp() throws Exception {

            url = new URL("https://cloud.seetest.io/wd/hub");
            dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);

            dc.setCapability(CapabilityType.PLATFORM, Platform.ANY);
            dc.setCapability("accessKey", ACCESS_KEY);
            dc.setCapability("testName", "Quick Start Chrome Browser Demo");
            driver = new RemoteWebDriver(url, dc);
        }


        @Test
        public void browserTestGoogleSearch() {
            driver.get("https://www.google.com");
            new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
            WebElement searchBar = driver.findElement(By.name("q"));
            searchBar.click();
            searchBar.sendKeys("Selenium jobs in Baglalore");
            searchBar.sendKeys(Keys.ENTER);
        }

        @AfterMethod
        public void tearDown() {
            System.out.println("Report URL: "+ driver.getCapabilities().getCapability("reportUrl"));
            driver.quit();
        }

    }

