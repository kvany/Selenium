package com.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WrappermethodGradlexcel {
	 
	WebDriver driver;
	//private File source;
	    
	public void inserttapp(String url) {
       
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
 		 driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 		driver.get(url);
     }
	
	 public void clickbyxpath(String locator1) {
    	 driver.findElement(By.xpath(locator1)).click();
	 }
	 
	 public void enterbyid(String locator,String Text)  {
		   driver.findElement(By.id(locator)).sendKeys(Text);
	 }
	 
	 
	 public void linkedinlogin(String url) throws IOException, InterruptedException {
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
				inserttapp(url);
				clickbyxpath("/html/body/nav/a[3]");
				
				Thread.sleep(2000);
				enterbyid("username", un);
				enterbyid("password", pwd);
	 }
			
	 }
	 
	  public void takescreenshot(String path) throws IOException {
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File source=ts.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source,new File(path));
	  }
	  
	  public void closeapp() throws InterruptedException {
		  Thread.sleep(3000);
		  driver.close();
	  }
	 
}
	

