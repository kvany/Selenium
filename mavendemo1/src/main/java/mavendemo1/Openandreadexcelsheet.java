package mavendemo1;

import org.testng.annotations.Test;


		
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;
		 
		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
	
		import org.apache.poi.xssf.usermodel.XSSFCell;
		import org.apache.poi.xssf.usermodel.XSSFRow;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		 
		public class Openandreadexcelsheet {
			@Test
		public void orangehrm() throws IOException  {
		//How to read excel files using Apache POI
		 FileInputStream fis = new FileInputStream("C:\\Users\\KRISHNA PC\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\Excelfile\\Orangelogintestcasedataprovider.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 Row row = sheet.getRow(0);
		 System.out.println("rowcount:" +sheet.getLastRowNum() );
	     int colNum = row.getLastCellNum();
	    System.out.println("rowcount:" +colcount ); 
	//	 Cell cell = row.getCell(0);
	//	 System.out.println(cell);
	//	 System.out.println(sheet.getRow(0).getCell(0));
	//	 System.out.println("rowcount:" );
			  
		 } 
		
	}


