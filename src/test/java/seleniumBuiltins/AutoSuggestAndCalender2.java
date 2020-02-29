package seleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AutoSuggestAndCalender2 extends LaunchBrowserUsingWebDriverManager {


    @Test

    public void multiselect() throws Exception{

        driver.get("https://www.redbus.in/");

        driver.findElement(By.cssSelector("#src")).sendKeys("Hyd");

        Thread.sleep(2000);

        List<WebElement> src = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
            System.out.println(src.size());
        for (WebElement ele: src) {
            if(ele.getText().contains("Ameerpet, Hyderabad")){
                ele.click();
                break;
            }

        }

        driver.findElement(By.cssSelector("#dest")).sendKeys("Madiwala, Bangalore");

        Thread.sleep(1000);


        driver.findElement(By.cssSelector(".fl.icon-calendar_icon-new.icon-onward-calendar.icon")).click();

        Thread.sleep(2000);
        List<WebElement> onCal = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));

        for(WebElement ele : onCal){

            if(ele.getText().contains("29")){
                ele.click();
                break;
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
            if(cal.getText().contains("13")){
                cal.click();
            }
            break;
        }



        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#search_btn")).click();

        Thread.sleep(4000);

    }

}
