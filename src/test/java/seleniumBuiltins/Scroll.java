package seleniumBuiltins;

import ReUsables.BaseClass;
import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void alerts() throws Exception{

        driver.get("https://www.amazon.in/");


       WebElement backtop = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));

        Thread.sleep(2000);
       BaseClass.scrollTillElement(driver,backtop);
        Thread.sleep(2000);
       BaseClass.highlightElement(driver,backtop,"red");
        Thread.sleep(2000);
       BaseClass.jsClick(driver,backtop);

        Thread.sleep(2000);

    }

}
