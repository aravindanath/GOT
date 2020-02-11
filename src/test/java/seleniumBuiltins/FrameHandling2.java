package seleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameHandling2 extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void alerts() throws Exception{

        driver.get("http://the-internet.herokuapp.com/iframe");

        Thread.sleep(1000);

        String title = driver.findElement(By.xpath("//h3")).getText();
        System.out.println("Title "+ title);

        driver.switchTo().frame("mce_0_ifr");

        WebElement text = driver.findElement(By.cssSelector("#tinymce"));
        text.clear();
        text.sendKeys(" We learnt frame handling! wow");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        String title2 = driver.findElement(By.xpath("//h3")).getText();
        System.out.println("Title2 "+ title2);


    }

}
