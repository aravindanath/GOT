package assignment;

import java.io.IOException;

import org.testng.annotations.*;

public class Praveena_RW_Ini extends Praveena_Base_Class {

	// Creating an ini file, writing in to it and reading the written key value
	// pair.

	// To create new ini file through code
	String path = System.getProperty("user.dir") + "//TestDataj//Praveena_Test_Data_Ini.ini";

	// To write in to ini file
	@Test(priority = 1)
	public void writeIniFile() throws IOException {
		Praveena_Base_Class.writeIni("TC001", "url", "https://www.amazon.com", path);
		Praveena_Base_Class.writeIni("TC001", "browser", "firefox", path);
		Praveena_Base_Class.writeIni("TC002", "url", "https://www.flipkart.com", path);
		Praveena_Base_Class.writeIni("TC002", "browser", "chrome", path);
		Praveena_Base_Class.writeIni("TC002", "version", "79", path);
		Praveena_Base_Class.writeIni("TC003", "url", "https://www.paytm.com", path);
	}

	// To read from ini file
	@Test(priority = 2)
	public void readIniFile() throws IOException {
		String value = Praveena_Base_Class.readIni("TC003", "url", path);
		System.out.println("Value for key is " + value);
		String value2 = Praveena_Base_Class.readIni("TC002", "url", path);
		System.out.println("Value for key is " + value2);
		String value3 = Praveena_Base_Class.readIni("TC001", "url", path);
		System.out.println("Value for key is " + value3);

	}
}
