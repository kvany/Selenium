package Learning;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// here we are taking the screen shot of google
public class Takesscreenshot {
	
    public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			System.out.println(" The Title of the page is:"+driver.getTitle());
	       //To take screenshot in use TakesScreenshot interface and method getScreenshotAs
	       File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(file, new File("./Screenshots/google1.png")); 
	       driver.close(); 
	
		}
	}


