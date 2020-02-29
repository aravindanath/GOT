package seleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SSLCertificate {

    WebDriver driver;
    @Test(priority = 1)
    public void SSLCertificateNotHandled() throws InterruptedException {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        ops.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(ops);
        driver.get("https://cacert.org/");

        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void SSLCertificateHandled() throws InterruptedException {
        WebDriver driver;
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        ops.addArguments("--incognito");
        ops.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(ops);
        driver.get("https://cacert.org/");

        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);

    }



}
