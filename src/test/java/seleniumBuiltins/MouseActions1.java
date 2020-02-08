package seleniumBuiltins;

import ReUsables.BaseClass;
import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;
import org.openqa.selenium.interactions.*;

public class MouseActions1 extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void alerts() throws Exception{

        driver.get("https://www.flipkart.com/");
        try{
            WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
            if(ele.isDisplayed()){
                ele.click();
            }
        }catch (Exception e){
            System.out.println("Login handled");
        }

        Thread.sleep(2000);
        WebElement women = driver.findElement(By.xpath("//span[text()='Women']"));
        WebElement saree = driver.findElement(By.xpath("(//a[text()='Sarees'])[1]"));
        Actions act = new Actions(driver);
        //Mouse hover
        act.moveToElement(women).perform();
        Thread.sleep(2000);
//        act.click(saree).perform();
        saree.click();
        Thread.sleep(3000);


    }

}
