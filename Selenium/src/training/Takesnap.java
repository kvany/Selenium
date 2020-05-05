package training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//for Takescreenshot we need to add common.io jars
public class Takesnap {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(" The Title of the page is:"+driver.getTitle());
      //  TakesScreenshot ts=(TakesScreenshot)driver;
        //File source=ts.getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(source,new File("C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\google.png"));
       
        
       //To take screenshot in use TakesScreenshot interface and method getScreenshotAs
       File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(file, new File("./Screenshots/google1.png")); 
       driver.close(); 
        
       // File source_file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(source_file, new File("C:\\screenshot.png"));
	}

}
