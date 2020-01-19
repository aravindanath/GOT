package FileHandling;

public class ReadWriteXlsx {
	
	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		
		Xls_Reader xls = new Xls_Reader(path);
		String sheetName ="Control";
		
//		String val = xls.getCellData(sheetName, 4, 1);
//		String cal =xls.getCellData(sheetName, "Runmode", 3);
//		System.out.println(cal);
		xls.setCellData(sheetName, "Runmode", 6, "NOOO");
		
	}

}
