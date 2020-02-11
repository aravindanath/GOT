package seleniumBuiltins;

import ReUsables.BaseClass;
import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdowns extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void alerts() throws Exception{

        driver.get("https://www.wikipedia.org/");

        Thread.sleep(1000);

        WebElement drop = driver.findElement(By.xpath("//select[@id='searchLanguage']"));

        Select sel = new Select(drop);
        sel.selectByVisibleText("Slovenčina");

        Thread.sleep(2000);

        BaseClass.selectbyIndex(drop,20);
        Thread.sleep(2000);
        BaseClass.selectbyValue(drop,"azb");
        Thread.sleep(2000);
        // Sendkeys is not recommended for dropdown
        drop.sendKeys("English");
        Thread.sleep(2000);
    }

}
