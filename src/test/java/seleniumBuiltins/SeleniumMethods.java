package seleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SeleniumMethods  extends LaunchBrowserUsingWebDriverManager {


    @Test
    public void built() throws Exception{
        String url1 = "https://www.google.com";
        driver.get(url1);

        driver.findElement(By.name("q")).sendKeys("Selenium jobs in UAE", Keys.ENTER);
        Thread.sleep(2000);

        String url = driver.getCurrentUrl();

        System.out.println(url);
        if(url!=url1){
            driver.get("https://www.facebook.com");
        }


        String title = driver.getTitle();

        System.out.println(title);

        String sc =  driver.getPageSource();

        System.out.println(sc);

        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().to("https://www.noon.com");

        driver.navigate().refresh();


    }


}
