package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Firefoxlogin {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/"); 
			System.out.println("The title of the page is :" +driver.getTitle());
	        driver.close();
		}
	}
		

