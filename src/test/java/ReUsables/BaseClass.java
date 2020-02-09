package ReUsables;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.*;

import org.ini4j.Ini;
import org.openqa.selenium.WebDriver;

public class BaseClass {

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
}
