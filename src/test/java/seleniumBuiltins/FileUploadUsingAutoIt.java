package seleniumBuiltins;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileUploadUsingAutoIt {
    WebDriver driver;
    @Test
    public void fileupload() throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver.manage().window().fullscreen();

        driver.get("http://www.tinyupload.com/");
        Thread.sleep(2000);
        WebElement up = driver.findElement(By.name("uploaded_file"));
        Actions act = new Actions(driver);
        act.click(up).build().perform();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("E:\\Demo\\fileUpload.exe");
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//img)[6]")).click();
        Thread.sleep(2000);
        driver.quit();

    }

}
