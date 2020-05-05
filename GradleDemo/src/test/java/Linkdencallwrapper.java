import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.testcases.WrappermethodGradle;



public class Linkdencallwrapper {
	
	
	public void faceboologin() throws IOException, InterruptedException{
		
		WrappermethodGradle wm = new WrappermethodGradle();
		wm.insertapp("https://www.linkedin.com/login");
		wm
}

	
	public void login() throws InterruptedException, IOException {

		FileInputStream fil=new FileInputStream(new File("C:\\Users\\KRISHNA PC\\Desktop\\FacebookExcelSheet_testng.xlsx"));
		
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
		//	System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
			
	//	WebDriver driver = new ChromeDriver();
			
			
		//	driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//	driver.ge
		//	driver.findElement(By.id("username")).sendKeys(un);
		//	driver.findElement(By.id("password")).sendKeys(pwd);
			Thread.sleep(5000);
			Thread.sleep(3000);
			driver.close();
			
		}
}
