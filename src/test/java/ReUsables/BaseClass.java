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

}
