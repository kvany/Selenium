package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/"); 
	System.out.println("The Title of the page is :"+driver.getTitle());
  driver.close();
	}
	}




