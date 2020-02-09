package seleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionsContextClick extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void alerts() throws Exception{

        driver.get("https://demoqa.com/tooltip-and-double-click/");

        Thread.sleep(2500);

        WebElement rightBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        WebElement edit = driver.findElement(By.xpath("//div[@id='rightclickItem']/div[1]"));
        Actions act = new Actions(driver);
        //RIght click
        act.contextClick(rightBtn).perform();
        Thread.sleep(2000);

         act.moveToElement(edit).perform();
         act.click(edit).perform();

        Thread.sleep(2000);



    }

}
