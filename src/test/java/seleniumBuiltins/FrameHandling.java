package seleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FrameHandling extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void alerts() throws Exception{

        driver.get("https://selenium.dev/selenium/docs/api/java/index.html");

        Thread.sleep(1000);

        driver.switchTo().frame("packageListFrame");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("(//a/span[text()='Alert'])[1]")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("classFrame");
        Thread.sleep(1000);
        String title = driver.findElement(By.xpath("//h2[contains(@class,'title')]")).getText();
        System.out.println(title);
    }

}
