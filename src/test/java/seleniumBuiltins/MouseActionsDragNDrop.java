package seleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionsDragNDrop extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void alerts() throws Exception{

        driver.get("http://demo.guru99.com/test/drag_drop.html");


        Thread.sleep(2000);

        WebElement src1  = driver.findElement(By.xpath("//*[@id='fourth']/a"));
        WebElement dec1  = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        Actions act = new Actions(driver);
        // double click

        act.dragAndDrop(src1,dec1).perform();

        Thread.sleep(4000);

    }

}
