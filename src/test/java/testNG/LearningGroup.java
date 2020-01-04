package testNG;

 
import org.testng.annotations.*;

public class LearningGroup {

	@BeforeGroups("database")
	public void setupDB() {
		System.out.println("setupDB()");
	}

	@AfterGroups("database")
	public void cleanDB() {
		System.out.println("cleanDB()");
	}

	@Test(groups = "selenium-test")
	public void runSelenium() {
		System.out.println("runSelenium()");
	}

	@Test(groups = "selenium-test")
	public void runSelenium1() {
		System.out.println("runSelenium()1");
	}

	@Test(groups = "database")
	public void testConnectOracle() {
		System.out.println("testConnectOracle()");
	}

	@Test(groups = "database",description="This is the description")
	public void testConnectMsSQL() {
		System.out.println("testConnectMsSQL");
	}

	@Test(dependsOnGroups = { "database", "selenium-test" })
	public void runFinal() {
		System.out.println("runFinal");
	}
}
