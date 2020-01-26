package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.ini4j.Ini;

public class BaseClass {

	/**
	 * @author aravindanathdm
	 * @param key
	 * @return
	 * @throws IOException
	 * 
	 */
	public static String getValue(String key) throws IOException {
		String path = System.getProperty("user.dir") + File.separator+"config.properties";
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

}
