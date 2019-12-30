package assignment;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SherinAssignementWrite {

	public static void main(String[] args) {
		String path2 = System.getProperty("user.dir")+"//Testdataj//sherinPData.properties";
		try {
			FileOutputStream FOS = new FileOutputStream(path2);
			Properties pro = new Properties();		
			pro.setProperty("User","Sherin");
			pro.store(FOS, "TestData");
			
		}
catch (IOException IE) {
	
}
	}

}
 