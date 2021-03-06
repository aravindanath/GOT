package ReUsables;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import org.ini4j.Ini;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;

public class BaseClass {


//	private static WebDriver driver;

	/**
	 * @author aravindanathdm
	 * @param key
	 * @return
	 * @throws IOException
	 * 
	 */
	public static String getValue(String key) throws IOException {
		String path = System.getProperty("user.dir") +File.separator +"config.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String urlDev = prop.getProperty(key);
		return urlDev;

	}

	public static String getValue(String header, String key) throws IOException {
		String path = System.getProperty("user.dir") + "//TestData//testData.ini";
		FileInputStream fis = new FileInputStream(path);
		Ini ini = new Ini();
		ini.load(fis);
		String val = ini.get(header, key);
		return val;

	}

	public  static void alertAccept(WebDriver driver){
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Title : "+alert.getText());
		alert.accept();

	}

	public static void alertDismiss(WebDriver driver){
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Title : "+alert.getText());
		alert.dismiss();

	}

	public static void alertSendKey(WebDriver driver,String value){
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Title : "+alert.getText());
		alert.sendKeys(value);

	}

	public static  String alertGetText(WebDriver driver){
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Title : "+alert.getText());
		return alert.getText();

	}

	/**
	 *
	 * @param driver
	 * @param num
	 */

	public void littleScrollVertical(WebDriver driver, String num){
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, "+num+");");
	}


	public void littleScrollHorizontal(WebDriver driver, String num){
		((JavascriptExecutor) driver).executeScript("window.scrollBy( "+num+",0);");
	}
//scrollHeight

	public void  ScrollTillEnd(WebDriver driver){
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollHeight");
	}


	public static void jsClick(WebDriver driver, WebElement ele) {

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);

	}

	public static void scrollTillElement(WebDriver driver,WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void highlightElement(WebDriver driver,WebElement element,String colour) {
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='5px solid "+colour+"'", element);
	}

	public static void selectbyVisibleText(WebElement element,String text){

		Select sel = new Select(element);
		sel.selectByVisibleText(text);

	}

	public static void selectbyValue(WebElement element,String text){

		Select sel = new Select(element);
		sel.selectByValue(text);

	}

	public static void selectbyIndex(WebElement element,int index){

		Select sel = new Select(element);
		sel.selectByIndex(index);

	}

	public static String city(){
		Faker fake  = new Faker(new Locale("en-IND"));
		Address address = fake.address();
		 String city =address.city();
		return city;

	}

	public static String fullName(){
		Faker fake  = new Faker(new Locale("en-IND"));
		Name name = fake.name();
		String fn =name.fullName();
		return fn;

	}




	public static String getcurrentdateandtime() {
		String str = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
			Date date = new Date();
			str = dateFormat.format(date);
			str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
		} catch (Exception e) {

		}
		return str;
	}

	public static String captureScreen(WebDriver driver) throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") +File.separator+"Output"  +File.separator+ "demo.png";
		System.out.println(dest);
		File target = new File(dest);
		FileUtils.copyFile(src, target);
		return dest;
	}


	public static String screenShot(WebDriver driver) throws IOException {
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		Date d = new Date();
		System.out.println(d);
		String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		String path = System.getProperty("user.dir") +File.separator+"Output"  +File.separator;
		String filePath = path + screenshotFile;
		ImageIO.write(screenshot.getImage(), "PNG", new File(filePath));
		return path;
	}

}
