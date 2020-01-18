package assignment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HariWriteToProperties  {
	public static void main(String[] args)
	{
		//C:\Users\msgan\git\GOT\TestDataj\hariPropertiesFile.properties
		
		String path = System.getProperty("user.dir") + "\\TestDataj\\hariPropertiesFile.properties";
		try
		{
		FileOutputStream fos = new FileOutputStream(path);
		Properties prop = new Properties();
		prop.setProperty("Url1","www.myntra.com");
		prop.store(fos, "writing to the prop file ");
		}
		
		catch (IOException IE) {
			
		}
		
	}
	

}
