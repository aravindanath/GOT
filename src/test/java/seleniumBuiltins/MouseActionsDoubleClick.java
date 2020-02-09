package seleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionsDoubleClick extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void alerts() throws Exception{

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");


        Thread.sleep(2000);

        WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
        Actions act = new Actions(driver);
        // double click

        act.doubleClick(doubleclick).perform();

        Thread.sleep(4000);

    }

}
