package seleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BasicAuth extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void alerts() throws Exception {
//        String URL = "http:// + admin + ":" + password + "@" + "the-internet.herokuapp.com";
        driver.get("https://admin:admin@the-internetherokuapp.com/basic-auth");
//        driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]")).click();
        Thread.sleep(5000);

    }
}