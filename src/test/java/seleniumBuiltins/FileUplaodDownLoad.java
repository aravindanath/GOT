package seleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class FileUplaodDownLoad extends LaunchBrowserUsingWebDriverManager {


    @Test(priority = 1)

    public void fileUpload() throws Exception{

        driver.get("http://the-internet.herokuapp.com/upload");

        String path = System.getProperty("user.dir")+ File.separator+"Agenda.txt";
        driver.findElement(By.cssSelector("#file-upload")).sendKeys(path);


        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#file-submit")).click();
    }


    @Test(priority = 2)

    public void fileDownload() throws Exception{

        driver.get("http://the-internet.herokuapp.com/download");


        driver.findElement(By.linkText("sample.jpg")).click();


        Thread.sleep(4000);

    }
}
