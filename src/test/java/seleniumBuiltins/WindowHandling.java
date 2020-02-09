package seleniumBuiltins;

import ReUsables.BaseClass;
import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.*;

public class WindowHandling extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void alerts() throws Exception{

        driver.get("https://www.amazon.in/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Womens wrist watch", Keys.ENTER);
        System.out.println("First window title: " +driver.getTitle());
        Set<String> windowId = driver.getWindowHandles();
        Iterator<String> iterate = windowId.iterator();

        Thread.sleep(2000);
        List<WebElement> watch= driver.findElements(By.xpath("//div[starts-with(@class,'s-result-list s-search-results sg-row')]/div"));
        watch.get(10).click();
        Thread.sleep(2000);
        System.out.println("========Second Window opens========");

        windowId = driver.getWindowHandles();

        iterate = windowId.iterator();

        String firstwindow=iterate.next(); //window id of the main window
        String SecondWindow=iterate.next();

        driver.switchTo().window(SecondWindow);

        String test =  driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
        System.out.println(test);
        System.out.println("Second window title: " +driver.getTitle());
        // child window will close
        driver.close();
        Thread.sleep(2000);
        driver.switchTo().window(firstwindow);

        System.out.println("First window title: " +driver.getTitle());
    }

}
