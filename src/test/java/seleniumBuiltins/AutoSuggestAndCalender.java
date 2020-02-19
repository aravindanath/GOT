package seleniumBuiltins;

import ReUsables.BaseClass;
import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.*;
public class AutoSuggestAndCalender extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void multiselect() throws Exception{

        driver.get("https://www.redbus.in/");

        driver.findElement(By.cssSelector("#src")).sendKeys("Hyd");
        Thread.sleep(2000);
        List<WebElement> pickup = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));

        System.out.println("Total no of pickup points: "+pickup.size());
        for(WebElement ele : pickup){
//            System.out.println("Pickup points: "+ele.getText());
            if(ele.getText().equals("Miyapur, Hyderabad")){
                ele.click();
            }
            break;
        }

        driver.findElement(By.cssSelector("#dest")).sendKeys("Madiwala, Bangalore");

        Thread.sleep(1000);



        driver.findElement(By.xpath("//*[@id='search']/div/div[3]/span")).click();
        Thread.sleep(2000);

        List<WebElement> onwardCal =driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));

        for(WebElement cal : onwardCal){
            if(cal.getText().equals("21")){
                cal.click();
            }
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='search']/div/div[4]/span")).click();
        Thread.sleep(2000);
        List<WebElement> returnCal = driver.findElements(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr/td"));

        for(WebElement cal : returnCal){
            if(!cal.getText().equals("Mar 2020")){
                driver.findElement(By.xpath("(//td[@class='next']/button[text()='>'])[2]")).click();
             //   break;
            }

            break;
        }
        List<WebElement> returnCal2 = driver.findElements(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr/td"));

        for(WebElement cal : returnCal2){
            if(!cal.getText().equals("Apr 2020")){
                driver.findElement(By.xpath("(//td[@class='next']/button[text()='>'])[2]")).click();

            }

             break;
        }

        Thread.sleep(2000);
        List<WebElement> returnCalDate = driver.findElements(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr/td"));

        for(WebElement cal : returnCalDate){
            if(cal.getText().equals("13")){
                cal.click();
            }
            break;
        }



        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#search_btn")).click();

        Thread.sleep(4000);
    }

}
