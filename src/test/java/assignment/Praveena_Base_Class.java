package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.ini4j.Ini;

public class Praveena_Base_Class {

	public static void FileCreation(String path) {
		File file = new File(path);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File created successfully!");
		} else {
			System.out.println("File is already present");
		}
	}

	public static String readProperties(String key, String path) throws IOException {
		// String path = System.getProperty("user.dir") +
		// "//TestDataj//Praveena_Test_Data_Prop.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}

	public static String readIni(String header, String key, String path) throws IOException {
		// String path = System.getProperty("user.dir") +
		// "//TestDataj//Praveena_Test_Data_Ini.ini";
		FileInputStream fis = new FileInputStream(path);
		Ini ini = new Ini();
		ini.load(fis);
		String value = ini.get(header, key);
		return value;

	}

	
	/**
	 * @author Praveena
	 * 
	 * 
	 * 
	 * @param key
	 * @param value
	 * @param path
	 * @throws IOException
	 */
	public static void writeProperties(String key, String value, String path) throws IOException {
		// String path = System.getProperty("user.dir") +
		// "//TestDataj//Praveena_Test_Data_Prop.properties";
		FileOutputStream fos = new FileOutputStream(path,true);	
		Properties prop = new Properties();
		prop.setProperty(key, value);
		prop.store(fos, "sample key value pair");
		System.out.println("Done with writing properties file");

	}

	public static void writeIni(String header, String key, String value, String path) throws IOException {
		// String path = System.getProperty("user.dir") +
		// "//TestDataj//Praveena_Test_Data_Ini.ini";
		FileOutputStream fos = new FileOutputStream(path,true);
		Ini ini = new Ini();
		ini.put(header, key, value);
		ini.store(fos);
		System.out.println("Done with writing ini file");
		

	}
}
