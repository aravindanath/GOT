package seleniumBuiltins;

import ReUsables.BaseClass;
import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitExample extends LaunchBrowserUsingWebDriverManager {



    @Test
    public void explicit() throws Exception{
        driver.get("https://www.expedia.co.in/");

        driver.findElement(By.cssSelector("#tab-flight-tab-hp")).click();

        driver.findElement(By.cssSelector("#flight-type-one-way-label-hp-flight")).click();

        driver.findElement(By.cssSelector("#flight-origin-hp-flight")).sendKeys("Bengaluru, India (BLR-Kempegowda Intl.)", Keys.TAB);

        driver.findElement(By.cssSelector("#flight-destination-hp-flight")).sendKeys("Delhi, India (DEL-Indira Gandhi Intl.)",Keys.TAB);

            driver.findElement(By.cssSelector("#flight-departing-single-hp-flight")).sendKeys("22/02/2020", Keys.TAB);

//            driver.findElement(By.cssSelector("#flight-returning-hp-flight")).sendKeys("25/02/2020");

        Thread.sleep(2000);
        WebElement search = driver.findElement(By.xpath("(//button/span[text()='Search'])[1]"));
        BaseClass.jsClick(driver,search);


        WebDriverWait wait  = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.
                elementToBeClickable(
                        By.xpath("(//button[contains(@class,'btn-secondary btn-action t-select-btn')])[1]"))).click();


    }
}
