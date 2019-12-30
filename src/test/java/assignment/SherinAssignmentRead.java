package assignment;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class SherinAssignmentRead {

	public static void main(String[] args) {
		String path= System.getProperty("user.dir")+"\\Testdataj\\sherinPData.properties";
		try {
		FileInputStream fis = new FileInputStream(path);
		Properties prop =new Properties();
		prop.load(fis);
		Enumeration em = prop.keys();
		while (em.hasMoreElements()) {
		String str = (String)em.nextElement();
		System.out.println(str+":"+prop.getProperty(str));
		}
		}
		catch (IOException e){
			
			e.printStackTrace();
		}
	}
}
