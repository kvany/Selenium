package com.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


/* Here we are trying to login to FB by giving username and Password through a file. File has 3 records, 
 * so the FB will open 3 times for 3 i/p s  Here we need both poi and ooxml for xl file
 */


public class Excelfacebooklogin {
	
	@Test
	
	public void login() throws InterruptedException, IOException {

		FileInputStream fil=new FileInputStream(new File("C:\\Users\\KRISHNA PC\\Desktop\\AghamaDoc\\FacebookExcelSheet_testng.xlsx"));
		
		XSSFWorkbook workbook = new XSSFWorkbook (fil);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
				
		int count = sheet.getLastRowNum();
		System.out.println(count);
		for(int i=1; i<=count; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(0);
			String un = cell.getStringCellValue();
			XSSFCell cell1 = row.getCell(1);
			String pwd = cell1.getStringCellValue();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://facebook.com");
			driver.findElement(By.name("email")).sendKeys(un);
			driver.findElement(By.name("pass")).sendKeys(pwd);
			Thread.sleep(5000);
			Thread.sleep(3000);
			driver.close();
			
		}
}
}