package Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// here we are opening facebook in firefox and closing the browser here we need gecodriver to work with firefox browser

public class firefoxlogin {

	public static void main(String[] args) {

			System.setProperty("webdriver.gecko.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/"); 
			System.out.println("The title of the page is :" +driver.getTitle());
	        driver.close();
		}
}
	
		

