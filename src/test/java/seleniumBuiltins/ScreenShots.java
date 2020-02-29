package seleniumBuiltins;

import ReUsables.BaseClass;
import browsers.LaunchBrowserUsingWebDriverManager;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenShots  extends LaunchBrowserUsingWebDriverManager {




    @Test
    public void demo() throws IOException {

        driver.get("https://www.amazon.com");

        BaseClass.screenShot(driver);
//       captureScreen();
//
    }







}
