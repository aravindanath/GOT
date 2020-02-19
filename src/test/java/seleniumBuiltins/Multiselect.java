package seleniumBuiltins;

import ReUsables.BaseClass;
import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Multiselect extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void multiselect() throws Exception{

        driver.get("https://www.toolsqa.com/automation-practice-form");

        Thread.sleep(1000);

       WebElement multi = driver.findElement(By.xpath("//label[text()='Continents']"));
            BaseClass.scrollTillElement(driver,multi);
            Thread.sleep(2000);
       WebElement continents = driver.findElement(By.xpath("//select[@id='continentsmultiple']"));

       Select sel = new Select(continents);
       sel.selectByVisibleText("Asia");
        sel.selectByVisibleText("Europe");
        sel.selectByVisibleText("Africa");
        sel.selectByVisibleText("South America");
        sel.selectByVisibleText("Antarctica");
        Thread.sleep(2000);
        sel.deselectByVisibleText("Asia");
//        sel.deselectAll();

        Thread.sleep(2000);
    }

}
