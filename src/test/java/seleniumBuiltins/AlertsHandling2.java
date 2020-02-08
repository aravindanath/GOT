package seleniumBuiltins;

import ReUsables.BaseClass;
import browsers.LaunchBrowserUsingWebDriverManager;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class AlertsHandling2 extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void alerts() throws Exception{

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        Thread.sleep(2000);
        BaseClass.alertAccept(driver);
        String text1 = driver.findElement(By.xpath("(//p[contains(text(),'')])[2]")).getText();
        System.out.println(text1);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        Thread.sleep(2000);
        BaseClass.alertGetText(driver);
        BaseClass.alertDismiss(driver);

        String text2 = driver.findElement(By.xpath("(//p[contains(text(),'')])[2]")).getText();
        System.out.println(text2);


        driver.findElement(By.xpath(" //button[contains(text(),'Click for JS Prompt')]")).click();
        Thread.sleep(2000);
        BaseClass.alertGetText(driver);
        BaseClass.alertSendKey(driver,"Hello all happy learning Alerts");
        BaseClass.alertAccept(driver);
        String text3 = driver.findElement(By.xpath("(//p[contains(text(),'')])[2]")).getText();
        System.out.println(text3);



    }

}
