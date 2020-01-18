package assignment;

import java.io.IOException;
import org.testng.annotations.*;

public class Praveena_RW_Properties extends Praveena_Base_Class {

	// Creating a properties file, writing in to it and reading the written key
	// value pair.
	// GIT HUB ui
	// To create new properties file through code
	String path = System.getProperty("user.dir") + "//TestDataj//Praveena_Test_Data_Prop.properties";

	// To write in to properties file
	@Test(priority = 1)
	public void writePropFile() throws IOException {
		Praveena_Base_Class.writeProperties("username", "praveena", path);
		Praveena_Base_Class.writeProperties("password", "selenium123", path);
		Praveena_Base_Class.writeProperties("url", "localhost", path);
	}

	// To read from properties file
	@Test(priority = 2)
	public void readPropFile() throws IOException {
		String value = Praveena_Base_Class.readProperties("password", path);
		System.out.println("Value for key is " + value);
		String value1 = Praveena_Base_Class.readProperties("username", path);
		System.out.println("Value for key is " + value1);		
	}
}
